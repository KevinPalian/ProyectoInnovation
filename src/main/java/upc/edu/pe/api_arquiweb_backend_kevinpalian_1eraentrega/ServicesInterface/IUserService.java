package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> list();
    public void insert(User u);

    public User searchbyId(int id);
    public void update(User u);
    public void delete(int id);
}
