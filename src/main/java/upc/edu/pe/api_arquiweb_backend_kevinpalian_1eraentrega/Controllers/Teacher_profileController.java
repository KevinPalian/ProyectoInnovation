package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.Experence_teacherDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos.Teacher_profileDTO;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.ITeacher_profileService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Teacher_profile;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/teacher-profiles")
public class Teacher_profileController {
    @Autowired
    private ITeacher_profileService tP;

    @GetMapping("/Lista")
    public List<Teacher_profileDTO> listar() {
        return tP.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Teacher_profileDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody Teacher_profileDTO dto) {
        ModelMapper m = new ModelMapper();
        Teacher_profile i = m.map(dto, Teacher_profile.class);
        tP.insert(i);
    }

    @GetMapping("/{id}")
    public Teacher_profileDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        Teacher_profileDTO dto = m.map(tP.searchById(id), Teacher_profileDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody Teacher_profileDTO dto) {
        ModelMapper m = new ModelMapper();
        Teacher_profile i = m.map(dto, Teacher_profile.class);
        tP.update(i);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) { tP.delete(id); }

    public List<Experence_teacherDTO> perfildocente(){

        List<Experence_teacherDTO> dtoLista=new ArrayList<>();
        List<String[]> fila=tP.obtenerPerfilesDocentes();
        for (String[] columna:fila) {
            Experence_teacherDTO dto = new Experence_teacherDTO();
            dto.setNameUser(columna[0]);
            dto.setLastnameUser(columna[1]);
            dto.setSpecialistTeacherProfile(columna[2]);
            dto.setExperienceTeacherProfile(columna[3]);
            dtoLista.add(dto);
        }
        return dtoLista;
        }
}
