package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.InstitutionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IInstitutionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/institucion")
public class InstitutionController {
    @Autowired
    private IInstitutionService iS;

    @GetMapping
    public List<InstitutionDTO> listar() {
        return iS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, InstitutionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody InstitutionDTO dto) {
        ModelMapper m = new ModelMapper();
        Institution i = m.map(dto, Institution.class);
        iS.insert(i);
    }

    @GetMapping("/{id}")
    public InstitutionDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        InstitutionDTO dto = m.map(iS.searchById(id), InstitutionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody InstitutionDTO dto) {
        ModelMapper m = new ModelMapper();
        Institution i = m.map(dto, Institution.class);
        iS.update(i);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) { iS.delete(id); }
}
