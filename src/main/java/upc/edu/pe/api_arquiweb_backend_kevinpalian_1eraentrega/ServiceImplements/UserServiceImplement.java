package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IUserService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IUserRepository;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public List<User> list() {return uR.findAll();}

    @Override
    public void insert(User u) {
        uR.save(u);
    }

    @Override
    public User searchbyId(int id) {
        return uR.findById(id).orElse(new User());
    }

    @Override
    public void update(User u) {
        uR.save(u);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }
}
