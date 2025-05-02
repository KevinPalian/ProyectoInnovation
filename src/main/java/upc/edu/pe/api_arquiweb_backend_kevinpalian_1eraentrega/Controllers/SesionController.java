package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.SesionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.ISesionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Sesion;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sesiones")
public class SesionController {

    @Autowired
    private ISesionService sS;

    @GetMapping
    public List<SesionDTO> listar() {
        return sS.list().stream().map(z -> {
            ModelMapper m = new ModelMapper();
            return m.map(z, SesionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody SesionDTO dto) {
        ModelMapper m = new ModelMapper();
        Sesion s = m.map(dto, Sesion.class);
        sS.insert(s);
    }

    @GetMapping("/{idSesion}")
    public SesionDTO buscarId(@PathVariable("idSesion") int idSesion) {
        ModelMapper m = new ModelMapper();
        SesionDTO dto = m.map(sS.listId(idSesion), SesionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody SesionDTO dto){
        ModelMapper m = new ModelMapper();
        Sesion s = m.map(dto, Sesion.class);
        sS.update(s);
    }


    @DeleteMapping("/{idSesion}")
    public void eliminar(@PathVariable("idSesion") int idSesion){sS.delete(idSesion);
    }




}