package pe.edu.upc.demo3157api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo3157api.dtos.FlashcardImgDTO;
import pe.edu.upc.demo3157api.entities.ImagenesFlashcard;
import pe.edu.upc.demo3157api.servicesinterfaces.IFlashcardImgService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/imagenes")
public class FlashcardImgController {
    @Autowired
    private IFlashcardImgService iS;

    @GetMapping("/lista")
    public List<FlashcardImgDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,FlashcardImgDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/prueba")
    public void Insertar(@RequestBody FlashcardImgDTO dto) {
        ModelMapper m = new ModelMapper();
        ImagenesFlashcard i = m.map(dto, ImagenesFlashcard.class);
        iS.insert(i);
    }

    @PutMapping
    public void modificar(@RequestBody FlashcardImgDTO dto) {
        ModelMapper m = new ModelMapper();
        ImagenesFlashcard i = m.map(dto, ImagenesFlashcard.class);
        iS.update(i);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        iS.delete(id);
    }

    @GetMapping("/{id}")
    public FlashcardImgDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        FlashcardImgDTO dto = m.map(iS.searchById(id), FlashcardImgDTO.class);
        return dto;
    }
}
