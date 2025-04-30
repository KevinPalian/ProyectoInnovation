package pe.edu.upc.demo3157api.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo3157api.entities.Comentary;
import pe.edu.upc.demo3157api.repositories.IComentaryRepository;
import pe.edu.upc.demo3157api.servicesinterfaces.IComentaryService;

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
}
