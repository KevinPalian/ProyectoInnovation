package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.ColorsDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IColorsService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Colors;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/colores")
public class ColorsController {
    @Autowired
    private IColorsService cL;

    @GetMapping
    public List<ColorsDTO> Listar(){
        return cL.List().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ColorsDTO.class);
        }).collect(Collectors.toList());
    }
@PostMapping
    public void Insertar(@RequestBody ColorsDTO dto){
        ModelMapper m = new ModelMapper();
    Colors c = m.map(dto,Colors.class);
    cL.insert(c);
}
@GetMapping("/{id}")
    public ColorsDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        ColorsDTO dto=m.map(cL.ListId(id),ColorsDTO.class);
        return dto;
}
}
