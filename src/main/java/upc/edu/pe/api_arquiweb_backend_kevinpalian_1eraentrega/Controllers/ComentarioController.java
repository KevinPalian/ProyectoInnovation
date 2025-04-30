package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.ComentarioDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentario;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService cS;

    @GetMapping("/lista")
    public List<ComentarioDTO> listar()
    {
        return cS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/prueba")
    public void insertar(@RequestBody ComentarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);
    }

    @PutMapping
    public void modificar(@RequestBody ComentarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ComentarioDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        ComentarioDTO dto = m.map(cS.searchById(id), ComentarioDTO.class);
        return dto;
    }
}
