package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.ISession_ratingService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session_rating;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.ISession_ratingRepository;

import java.util.List;

@Service
public class Session_ratingImplement implements ISession_ratingService {
    @Autowired
    private ISession_ratingRepository sR;

    @Override
    public List<Session_rating> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Session_rating i) {
        sR.save(i);
    }

    @Override
    public Session_rating searchById(int id) {
        return sR.findById(id).orElse(new Session_rating());
    }

    @Override
    public void update(Session_rating i) {
        sR.save(i);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
