package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.Flashcard_SuggestionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcardService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcard_SuggestionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/institucion")
public class Flashcard_SuggestionController {
    @Autowired
    private IFlashcard_SuggestionService fsS;

    @GetMapping
    public List<Flashcard_SuggestionDTO> listar() {
        return fsS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Flashcard_SuggestionDTO.class);
        }).collect(Collectors.toList());
    }
}
