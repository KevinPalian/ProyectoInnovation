package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentario;
import java.util.List;

public interface IComentarioService {
    public List<Comentario> list();
    public void insert(Comentario c);
    public void update(Comentario c);
    public void delete(int id);
    public Comentario searchById(int id);
}
