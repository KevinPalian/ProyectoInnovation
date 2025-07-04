package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IDiagnosticService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Diagnostic;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IDiagnosticRepository;

import java.util.List;

@Service
public class DiagnosticServiceImplement implements IDiagnosticService {
    @Autowired
    private IDiagnosticRepository dR;

    @Override
    public List<Diagnostic> list() {
        return dR.findAll();
    }

    @Override
    public void insert(Diagnostic d) {
        dR.save(d);
    }

    @Override
    public Diagnostic searchbyId(int id) {
        return dR.findById(id).orElse(new Diagnostic());
    }

    @Override
    public void update(Diagnostic d) {
        dR.save(d);
    }

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }
}
