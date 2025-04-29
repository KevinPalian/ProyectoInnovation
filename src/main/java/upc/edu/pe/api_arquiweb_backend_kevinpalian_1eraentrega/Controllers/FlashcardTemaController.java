package pe.edu.upc.demo3157api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo3157api.dtos.FlashcardImgDTO;
import pe.edu.upc.demo3157api.dtos.FlashcardTemaDTO;
import pe.edu.upc.demo3157api.entities.ImagenesFlashcard;
import pe.edu.upc.demo3157api.entities.TemaFlashcard;
import pe.edu.upc.demo3157api.servicesinterfaces.IFlashcardTemaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/temas")
public class FlashcardTemaController {
    @Autowired
    private IFlashcardTemaService tfS;

    @GetMapping("/lista")
    public List<FlashcardTemaDTO> listar(){
        return tfS.list().stream().map(w->{
            ModelMapper m = new ModelMapper();
            return m.map(w,FlashcardTemaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/prueba")
    public void Insertar(@RequestBody FlashcardTemaDTO dto) {
        ModelMapper m = new ModelMapper();
        TemaFlashcard tF = m.map(dto, TemaFlashcard.class);
        tfS.insert(tF);
    }

    @PutMapping
    public void modificar(@RequestBody FlashcardTemaDTO dto) {
        ModelMapper m = new ModelMapper();
        TemaFlashcard tF = m.map(dto, TemaFlashcard.class);
        tfS.update(tF);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tfS.delete(id);
    }

    @GetMapping("/{id}")
    public FlashcardTemaDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        FlashcardTemaDTO dto = m.map(tfS.searchById(id), FlashcardTemaDTO.class);
        return dto;
    }

    @GetMapping("/nombres")
    public List<FlashcardTemaDTO> buscarPorNombre(@RequestParam String nombre){
        return tfS.search(nombre).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,FlashcardTemaDTO.class);
        }).collect(Collectors.toList());
    }
}
