package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.RolesDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IRolesService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Roles;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolesController {
@Autowired
    private IRolesService rR;

@GetMapping
private List<RolesDTO> Listar(){
    return rR.List().stream().map(x->{
        ModelMapper m = new ModelMapper();
        return m.map(x,RolesDTO.class);
    }).collect(Collectors.toList());
}

@PostMapping
    public void insertar(@RequestBody RolesDTO dto){
    ModelMapper m = new ModelMapper();
    Roles r = m.map(dto,Roles.class);
    rR.insert(r);
}

@GetMapping("/{id}")
    public RolesDTO ListId(@PathVariable("id") int id){
    ModelMapper m = new ModelMapper();
    RolesDTO dto= m.map(rR.ListId(id),RolesDTO.class);
    return dto;
}
    @GetMapping("/{idlist}")
    public RolesDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        RolesDTO dto = m.map(rR.searchById(id), RolesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RolesDTO dto) {
        ModelMapper m = new ModelMapper();
        Roles r = m.map(dto, Roles.class);
        rR.update(r);
    }

    @DeleteMapping("/{iddelit}")
    public void eliminar(@PathVariable("id") int id) { rR.delete(id); }
}
