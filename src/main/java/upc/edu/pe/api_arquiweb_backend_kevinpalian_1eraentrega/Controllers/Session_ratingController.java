package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.InstitutionDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.Session_ratingDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IInstitutionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.ISession_ratingService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session_rating;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class Session_ratingController {
    @Autowired
    private ISession_ratingService sR;

    @GetMapping
    public List<Session_ratingDTO> listar() {
        return sR.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Session_ratingDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody Session_ratingDTO dto) {
        ModelMapper m = new ModelMapper();
        Session_rating i = m.map(dto, Session_rating.class);
        sR.insert(i);
    }

    @GetMapping("/{id}")
    public Session_ratingDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        Session_ratingDTO dto = m.map(sR.searchById(id), Session_ratingDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody Session_ratingDTO dto) {
        ModelMapper m = new ModelMapper();
        Session_rating i = m.map(dto, Session_rating.class);
        sR.update(i);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) { sR.delete(id); }
}
