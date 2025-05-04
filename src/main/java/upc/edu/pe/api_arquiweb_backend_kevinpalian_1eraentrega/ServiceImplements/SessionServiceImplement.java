package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.ISessionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.ISessionRepository;

import java.util.List;

@Service

public class SessionServiceImplement implements ISessionService {
    @Autowired
    private ISessionRepository sR;
    @Override
    public List<Session> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Session s) {
        sR.save(s);
    }

    @Override
    public Session listId(int idSession) {
        return sR.findById(idSession).orElse(new Session());

    }

    @Override
    public void update(Session s) {
        sR.save(s);
    }

    @Override
    public void delete(int idSession) {
        sR.deleteById(idSession);
    }


}
