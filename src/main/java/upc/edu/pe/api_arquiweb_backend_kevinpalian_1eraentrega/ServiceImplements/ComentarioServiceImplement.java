package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentario;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IComentarioRepository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IComentarioService;

import java.util.List;
@Service
public class ComentarioServiceImplement implements IComentarioService {

    @Autowired
    private IComentarioRepository cR;

    @Override
    public List<Comentario> list() {return cR.findAll();}

    @Override
    public void insert(Comentario c) {cR.save(c);}

    @Override
    public void update(Comentario c) {cR.save(c);}

    @Override
    public void delete(int id) {cR.deleteById(id);}

    @Override
    public Comentario searchById(int id) {
        return cR.findById(id).orElse(new Comentario());
    }
}
