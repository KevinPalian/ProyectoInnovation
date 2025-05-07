package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.ITeacher_profileService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Teacher_profile;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IInstitutionRepository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.ITeacher_profileRepository;

import java.util.List;

@Service
public class Teacher_profileImplement implements ITeacher_profileService {
    @Autowired
    private ITeacher_profileRepository iR;

    @Override
    public List<Teacher_profile> list() {
        return iR.findAll();
    }

    @Override
    public void insert(Teacher_profile i) {
        iR.save(i);
    }

    @Override
    public Teacher_profile searchById(int id) {
        return iR.findById(id).orElse(new Teacher_profile());
    }

    @Override
    public void update(Teacher_profile i) {
        iR.save(i);
    }

    @Override
    public void delete(int id) {
        iR.deleteById(id);
    }

    @Override
    public List<String[]> obtenerPerfilesDocentes() {
        return iR.getAllTeacherProfiles();
    }

}
