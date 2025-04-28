package pe.edu.upc.demo3157api.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo3157api.entities.TemaFlashcard;
import pe.edu.upc.demo3157api.repositories.IFlashcardTemaRepository;
import pe.edu.upc.demo3157api.servicesinterfaces.IFlashcardTemaService;

import java.util.List;
@Service
public class FlashcardTemaServiceImplement implements IFlashcardTemaService {
    @Autowired
    private IFlashcardTemaRepository tfR;

    @Override
    public List<TemaFlashcard> list() {
        return tfR.findAll();
    }

    @Override
    public void insert(TemaFlashcard tF) {
        tfR.save(tF);
    }

    @Override
    public void update(TemaFlashcard tF) {
        tfR.save(tF);
    }

    @Override
    public void delete(int id) {
        tfR.deleteById(id);
    }

    @Override
    public TemaFlashcard searchById(int id) {
        return tfR.findById(id).orElse(new TemaFlashcard());
    }

    @Override
    public List<TemaFlashcard> search(String n){
        return tfR.buscar(n);
    }
}
