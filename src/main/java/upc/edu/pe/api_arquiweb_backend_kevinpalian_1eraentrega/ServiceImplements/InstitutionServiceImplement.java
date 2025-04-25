package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IInstitutionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IInstitutionRepository;

import java.util.List;

@Service
public class InstitutionServiceImplement implements IInstitutionService {
    @Autowired
    private IInstitutionRepository iR;

    @Override
    public List<Institution> list() {
        return iR.findAll();
    }

    @Override
    public void insert(Institution i) {
        iR.save(i);
    }

    @Override
    public Institution searchById(int id) {
        return iR.findById(id).orElse(new Institution());
    }

    @Override
    public void update(Institution i) {
        iR.save(i);
    }

    @Override
    public void delete(int id) {
        iR.deleteById(id);
    }
}
