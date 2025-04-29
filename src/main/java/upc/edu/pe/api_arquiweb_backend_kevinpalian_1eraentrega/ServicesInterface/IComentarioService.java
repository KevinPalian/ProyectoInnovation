package pe.edu.upc.demo3157api.servicesinterfaces;

import pe.edu.upc.demo3157api.entities.Comentario;
import java.util.List;

public interface IComentarioService {
    public List<Comentario> list();
    public void insert(Comentario c);
    public void update(Comentario c);
    public void delete(int id);
    public Comentario searchById(int id);
}
