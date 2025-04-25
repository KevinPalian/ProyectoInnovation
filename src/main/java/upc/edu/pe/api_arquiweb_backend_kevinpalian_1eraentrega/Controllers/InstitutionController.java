package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.InstitutionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IInstitutionService;


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
}
