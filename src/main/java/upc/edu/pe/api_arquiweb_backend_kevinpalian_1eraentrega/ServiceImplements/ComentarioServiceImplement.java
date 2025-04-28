package pe.edu.upc.demo3157api.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo3157api.entities.Comentario;
import pe.edu.upc.demo3157api.repositories.IComentarioRepository;
import pe.edu.upc.demo3157api.servicesinterfaces.IComentarioService;

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
