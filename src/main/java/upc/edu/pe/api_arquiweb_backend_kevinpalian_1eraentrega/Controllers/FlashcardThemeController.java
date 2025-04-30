package pe.edu.upc.demo3157api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo3157api.dtos.FlashcardThemeDTO;
import pe.edu.upc.demo3157api.entities.FlashcardTheme;
import pe.edu.upc.demo3157api.servicesinterfaces.IFlashcardThemeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/temas")
public class FlashcardThemeController {
    @Autowired
    private IFlashcardThemeService tfS;

    @GetMapping("/lista")
    public List<FlashcardThemeDTO> listar(){
        return tfS.list().stream().map(w->{
            ModelMapper m = new ModelMapper();
            return m.map(w,FlashcardThemeDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/prueba")
    public void Insertar(@RequestBody FlashcardThemeDTO dto) {
        ModelMapper m = new ModelMapper();
        FlashcardTheme tF = m.map(dto, FlashcardTheme.class);
        tfS.insert(tF);
    }

    @PutMapping
    public void modificar(@RequestBody FlashcardThemeDTO dto) {
        ModelMapper m = new ModelMapper();
        FlashcardTheme tF = m.map(dto, FlashcardTheme.class);
        tfS.update(tF);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tfS.delete(id);
    }

    @GetMapping("/{id}")
    public FlashcardThemeDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        FlashcardThemeDTO dto = m.map(tfS.searchById(id), FlashcardThemeDTO.class);
        return dto;
    }

    @GetMapping("/nombres")
    public List<FlashcardThemeDTO> buscarPorNombre(@RequestParam String nombre){
        return tfS.search(nombre).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,FlashcardThemeDTO.class);
        }).collect(Collectors.toList());
    }
}
