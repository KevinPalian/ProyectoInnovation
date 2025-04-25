package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcardService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Flashcard;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IFlashcardRepository;

import java.util.List;

@Service
public class FlashcardServiceImplement implements IFlashcardService {
    @Autowired
    private IFlashcardRepository fR;

    @Override
    public List<Flashcard> list() {return fR.findAll(); }

    @Override
    public void insert(Flashcard f) {
        fR.save(f);
    }

    @Override
    public Flashcard searchbyId(int id) {
        return fR.findById(id).orElse(new Flashcard());
    }

    @Override
    public void update(Flashcard f) {
        fR.save(f);
    }

    @Override
    public void delete(int id) {
        fR.deleteById(id);
    }
}
