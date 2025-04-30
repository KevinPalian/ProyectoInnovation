package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.Flashcard_SuggestionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements.Flashcard_SuggestionServiceImplement;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcardService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcard_SuggestionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.flashcard_suggestion;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/institucion_sugerencia")
public class Flashcard_SuggestionController {
    @Autowired
    private IFlashcard_SuggestionService fsS;
    @Autowired
    private Flashcard_SuggestionServiceImplement flashcard_SuggestionServiceImplement;

    @GetMapping
    public List<Flashcard_SuggestionDTO> listar() {
        return fsS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Flashcard_SuggestionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody Flashcard_SuggestionDTO dto) {
        ModelMapper m = new ModelMapper();
        flashcard_suggestion fs = m.map(dto, flashcard_suggestion.class);
        fsS.insert(fs);
    }

    @GetMapping("/{id}")
    public Flashcard_SuggestionDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        Flashcard_SuggestionDTO dto = m.map(fsS.searchbyId(id), Flashcard_SuggestionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody Flashcard_SuggestionDTO dto) {
        ModelMapper m = new ModelMapper();
        flashcard_suggestion fs = m.map(dto, flashcard_suggestion.class);
        fsS.update(fs);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        fsS.delete(id);
    }
}
