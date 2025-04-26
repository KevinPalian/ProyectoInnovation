package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IColorsService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Colors;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IColorsRepository;

import java.util.List;

@Service
public class ColorsServiceImplement implements IColorsService {
   @Autowired
   private IColorsRepository cL;
    @Override
    public List<Colors> List() {
        return cL.findAll();
    }

    @Override
    public void insert(Colors c) {
        cL.save(c);
    }

    @Override
    public Colors ListId(int id) {
        return cL.findById(id).orElse(new Colors());
    }
}
