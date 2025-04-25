package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.FlashcardDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcardService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Flashcard;


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

    @PostMapping
    public void insertar(@RequestBody FlashcardDTO dto) {
        ModelMapper m = new ModelMapper();
        Flashcard f = m.map(dto, Flashcard.class);
        fS.insert(f);
    }

    @GetMapping("/{id}")
    public FlashcardDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        FlashcardDTO dto = m.map(fS.searchbyId(id), FlashcardDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody FlashcardDTO dto) {
        ModelMapper m = new ModelMapper();
        Flashcard f = m.map(dto, Flashcard.class);
        fS.update(f);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        fS.delete(id);
    }

}
