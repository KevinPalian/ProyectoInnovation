package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.ComentaryDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IComentaryService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentaryController {
    @Autowired
    private IComentaryService cS;

    @GetMapping("/lista")
    public List<ComentaryDTO> listar()
    {
        return cS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ComentaryDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/prueba")
    public void insertar(@RequestBody ComentaryDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentary c = m.map(dto, Comentary.class);
        cS.insert(c);
    }

    @PutMapping
    public void modificar(@RequestBody ComentaryDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentary c = m.map(dto, Comentary.class);
        cS.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ComentaryDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        ComentaryDTO dto = m.map(cS.searchById(id), ComentaryDTO.class);
        return dto;
    }
}
