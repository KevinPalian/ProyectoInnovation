package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.ColorsDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IColorsService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Colors;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/colores")
@Slf4j
public class ColorsController {

    @Autowired
    private IColorsService cL;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ColorsDTO> Listar() {
        log.info("Listando todos los colores");
        log.debug("Ejecutando método Listar()");
        return cL.List().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ColorsDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void Insertar(@RequestBody ColorsDTO dto) {
        log.info("Insertando nuevo color: {}", dto);
        log.trace("DTO recibido: {}", dto);
        ModelMapper m = new ModelMapper();
        Colors c = m.map(dto, Colors.class);
        cL.insert(c);
        log.debug("Color insertado correctamente");
    }

    @GetMapping("/{id}")
    public ColorsDTO buscarId(@PathVariable("id") int id) {
        log.info("Buscando color por ID: {}", id);
        ModelMapper m = new ModelMapper();
        ColorsDTO dto = m.map(cL.ListId(id), ColorsDTO.class);
        return dto;
    }

    @GetMapping("/{idlist}")
    public ColorsDTO listarId(@PathVariable("id") int id) {
        log.info("Listando color por ID (searchById): {}", id);
        ModelMapper m = new ModelMapper();
        ColorsDTO dto = m.map(cL.searchById(id), ColorsDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ColorsDTO dto) {
        log.info("Modificando color: {}", dto);
        ModelMapper m = new ModelMapper();
        Colors i = m.map(dto, Colors.class);
        cL.update(i);
        log.debug("Color modificado correctamente");
    }

    @DeleteMapping("/{iddelit}")
    public void eliminar(@PathVariable("id") int id) {
        log.warn("Eliminando color con ID: {}", id);
        cL.delete(id);
        log.info("Color eliminado exitosamente");
    }

}