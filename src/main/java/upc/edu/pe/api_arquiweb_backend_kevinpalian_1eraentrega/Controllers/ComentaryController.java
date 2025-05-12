package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.ComentaryDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.QuantityCommentDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IComentaryService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
@Slf4j
public class ComentaryController {

    @Autowired
    private IComentaryService cS;

    @GetMapping("/lista")
    public List<ComentaryDTO> listar() {
        log.info("Listando todos los comentarios");
        return cS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ComentaryDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/prueba")
    public void insertar(@RequestBody ComentaryDTO dto) {
        log.info("Insertando comentario: {}", dto);
        ModelMapper m = new ModelMapper();
        Comentary c = m.map(dto, Comentary.class);
        cS.insert(c);
        log.debug("Comentario insertado correctamente");
    }

    @PutMapping
    public void modificar(@RequestBody ComentaryDTO dto) {
        log.info("Modificando comentario: {}", dto);
        ModelMapper m = new ModelMapper();
        Comentary c = m.map(dto, Comentary.class);
        cS.update(c);
        log.debug("Comentario modificado correctamente");
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        log.warn("Eliminando comentario con ID: {}", id);
        cS.delete(id);
        log.info("Comentario eliminado exitosamente");
    }

    @GetMapping("/{id}")
    public ComentaryDTO listarId(@PathVariable("id") int id) {
        log.info("Buscando comentario con ID: {}", id);
        ModelMapper m = new ModelMapper();
        ComentaryDTO dto = m.map(cS.searchById(id), ComentaryDTO.class);
        return dto;
    }

    @GetMapping("/cantidades")
    public List<QuantityCommentDTO> obtenerComentarios(){
        List<QuantityCommentDTO> dtoList = new ArrayList<>();
        List<String[]> filaList = cS.quantityCommentByUser();
        for(String[] columna:filaList){
            QuantityCommentDTO dto = new QuantityCommentDTO();
            dto.setIdUser(Integer.parseInt(columna[0]));
            dto.setNameUser(columna[1]);
            dto.setLastnameUser(columna[2]);
            dto.setInstitution_codeUser(Integer.parseInt(columna[3]));
            dto.setQuantityComment(Integer.parseInt(columna[4]));
            dtoList.add(dto);
        }

        return dtoList;
    }
}
