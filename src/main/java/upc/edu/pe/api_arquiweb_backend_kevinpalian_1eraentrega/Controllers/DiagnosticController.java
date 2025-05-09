package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.DiagnosticDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IDiagnosticService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Diagnostic;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/diagnostico")
@Slf4j
public class DiagnosticController {

    @Autowired
    private IDiagnosticService dS;

    @GetMapping
    public List<DiagnosticDTO> listar() {
        log.info("Listando todos los diagnósticos");
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DiagnosticDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DiagnosticDTO dto) {
        log.info("Insertando diagnóstico: {}", dto);
        ModelMapper m = new ModelMapper();
        Diagnostic d = m.map(dto, Diagnostic.class);
        dS.insert(d);
        log.debug("Diagnóstico insertado correctamente");
    }

    @GetMapping("/{id}")
    public DiagnosticDTO listarId(@PathVariable("id") int id) {
        log.info("Buscando diagnóstico con ID: {}", id);
        ModelMapper m = new ModelMapper();
        DiagnosticDTO dto = m.map(dS.searchbyId(id), DiagnosticDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody DiagnosticDTO dto) {
        log.info("Modificando diagnóstico: {}", dto);
        ModelMapper m = new ModelMapper();
        Diagnostic d = m.map(dto, Diagnostic.class);
        dS.update(d);
        log.debug("Diagnóstico modificado correctamente");
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        log.warn("Eliminando diagnóstico con ID: {}", id);
        dS.delete(id);
        log.info("Diagnóstico eliminado exitosamente");
    }
}