package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary;
import java.util.List;

public interface IComentaryService {
    public List<Comentary> list();
    public void insert(Comentary c);
    public void update(Comentary c);
    public void delete(int id);
    public Comentary searchById(int id);
}
