package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;

import java.util.List;

public interface IInstitutionService {
    public List<Institution> list();
    public void insert(Institution i);
    public Institution searchById(int id);
    public void update(Institution i);
    public void delete(int id);
}
