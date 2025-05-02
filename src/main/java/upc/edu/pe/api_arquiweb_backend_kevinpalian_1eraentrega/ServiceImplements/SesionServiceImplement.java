package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.ISesionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Sesion;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.ISesionRepository;

import java.util.List;

@Service

public class SesionServiceImplement implements ISesionService {
    @Autowired
    private ISesionRepository sR;
    @Override
    public List<Sesion> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Sesion s) {
        sR.save(s);
    }

    @Override
    public Sesion listId(int idSesion) {
        return sR.findById(idSesion).orElse(new Sesion());

    }

    @Override
    public void update(Sesion s) {
        sR.save(s);
    }

    @Override
    public void delete(int idSesion) {
        sR.deleteById(idSesion);
    }


}
