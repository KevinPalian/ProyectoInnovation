package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IComentaryRepository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IComentaryService;

import java.util.List;
@Service
public class ComentaryServiceImplement implements IComentaryService {

    @Autowired
    private IComentaryRepository cR;

    @Override
    public List<Comentary> list() {return cR.findAll();}

    @Override
    public void insert(Comentary c) {cR.save(c);}

    @Override
    public void update(Comentary c) {cR.save(c);}

    @Override
    public void delete(int id) {cR.deleteById(id);}

    @Override
    public Comentary searchById(int id) {
        return cR.findById(id).orElse(new Comentary());
    }

    @Override
    public List<String[]> quantityCommentByUser() {
        return cR.quantityCommentByUser();
    }
}
