package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session;

import java.util.List;

public interface ISessionService {

    public List<Session> list();
    public void insert(Session s);
    public Session listId(int idSession);
    public void update(Session s);
    public void delete(int idSession);
}
