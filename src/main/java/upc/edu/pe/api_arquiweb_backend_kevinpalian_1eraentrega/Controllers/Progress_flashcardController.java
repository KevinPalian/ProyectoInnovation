package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.InstitutionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.Progress_flashcardDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IInstitutionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IProgress_flashcardService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Progress_flashcard;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class Progress_flashcardController {

    @Autowired
    private IProgress_flashcardService pF;

    @GetMapping
    public List<Progress_flashcardDTO> listar() {
        return pF.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Progress_flashcardDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody Progress_flashcardDTO dto) {
        ModelMapper m = new ModelMapper();
        Progress_flashcard i = m.map(dto, Progress_flashcard.class);
        pF.insert(i);
    }

    @GetMapping("/{id}")
    public Progress_flashcardDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        Progress_flashcardDTO dto = m.map(pF.searchById(id), Progress_flashcardDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody Progress_flashcardDTO dto) {
        ModelMapper m = new ModelMapper();
        Progress_flashcard i = m.map(dto, Progress_flashcard.class);
        pF.update(i);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) { pF.delete(id); }
}
