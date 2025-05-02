package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.SessionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.ISessionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sesiones")
public class SessionController {

    @Autowired
    private ISessionService sS;

    @GetMapping
    public List<SessionDTO> listar() {
        return sS.list().stream().map(z -> {
            ModelMapper m = new ModelMapper();
            return m.map(z, SessionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody SessionDTO dto) {
        ModelMapper m = new ModelMapper();
        Session s = m.map(dto, Session.class);
        sS.insert(s);
    }

    @GetMapping("/{idSesion}")
    public SessionDTO buscarId(@PathVariable("idSesion") int idSession) {
        ModelMapper m = new ModelMapper();
        SessionDTO dto = m.map(sS.listId(idSession), SessionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody SessionDTO dto){
        ModelMapper m = new ModelMapper();
        Session s = m.map(dto, Session.class);
        sS.update(s);
    }


    @DeleteMapping("/{idSesion}")
    public void eliminar(@PathVariable("idSesion") int idSession){sS.delete(idSession);
    }




}