package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session_rating;

import java.util.List;

public interface ISession_ratingService {
    public List<Session_rating> list();
    public void insert(Session_rating i);
    public Session_rating searchById(int id);
    public void update(Session_rating i);
    public void delete(int id);
}
