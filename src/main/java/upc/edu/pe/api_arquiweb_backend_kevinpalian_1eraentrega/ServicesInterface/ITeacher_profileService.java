package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Teacher_profile;

import java.util.List;

public interface ITeacher_profileService {
    public List<Teacher_profile> list();
    public void insert(Teacher_profile i);
    public Teacher_profile searchById(int id);
    public void update(Teacher_profile i);
    public void delete(int id);
}
