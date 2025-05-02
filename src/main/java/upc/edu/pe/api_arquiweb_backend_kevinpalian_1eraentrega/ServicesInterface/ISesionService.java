package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Sesion;

import java.util.List;

public interface ISesionService {

    public List<Sesion> list();
    public void insert(Sesion s);
    public Sesion listId(int idSesion);
    public void update(Sesion s);
    public void delete(int idSesion);
}
