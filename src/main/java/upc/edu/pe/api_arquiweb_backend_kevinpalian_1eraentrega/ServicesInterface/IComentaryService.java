package pe.edu.upc.demo3157api.servicesinterfaces;

import pe.edu.upc.demo3157api.entities.Comentary;
import java.util.List;

public interface IComentaryService {
    public List<Comentary> list();
    public void insert(Comentary c);
    public void update(Comentary c);
    public void delete(int id);
    public Comentary searchById(int id);
}
