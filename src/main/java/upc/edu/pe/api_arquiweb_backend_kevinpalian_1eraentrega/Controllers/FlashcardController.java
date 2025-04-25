package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.FlashcardDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.UserDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcardService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/flashcard")
public class FlashcardController {
    @Autowired
    private IFlashcardService fS;

    @GetMapping("/lista")
    public List<FlashcardDTO> listar() {
        return fS.list().stream().map(w -> {
            ModelMapper m = new ModelMapper();
            return m.map(w, FlashcardDTO.class);
        }).collect(Collectors.toList());
    }

}
