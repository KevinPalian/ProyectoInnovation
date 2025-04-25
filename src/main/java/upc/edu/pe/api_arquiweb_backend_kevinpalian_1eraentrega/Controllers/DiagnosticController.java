package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.DiagnosticDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.Flashcard_SuggestionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IDiagnosticService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcard_SuggestionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Diagnostic;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/diagnostico")
public class DiagnosticController {
    @Autowired
    private IDiagnosticService dS;

    @GetMapping
    public List<DiagnosticDTO> listar() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DiagnosticDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DiagnosticDTO dto){
        ModelMapper m = new ModelMapper();
        Diagnostic d = m.map(dto, Diagnostic.class);
        dS.insert(d);
    }

    @GetMapping("/{id}")
    public DiagnosticDTO listarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        DiagnosticDTO dto = m.map(dS.searchbyId(id), DiagnosticDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody DiagnosticDTO dto){
        ModelMapper m = new ModelMapper();
        Diagnostic d = m.map(dto, Diagnostic.class);
        dS.update(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        dS.delete(id);
    }

}
