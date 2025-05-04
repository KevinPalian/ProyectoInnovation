package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IProgress_flashcardService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Progress_flashcard;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session_rating;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IProgress_flashcardRepository;

import java.util.List;

@Service
public class Progress_flashcardImplement implements IProgress_flashcardService {
    @Autowired
    private IProgress_flashcardRepository pF;

    @Override
    public List<Progress_flashcard> list() {
        return pF.findAll();
    }

    @Override
    public void insert(Progress_flashcard i) {
        pF.save(i);
    }

    @Override
    public Progress_flashcard searchById(int id) {
        return pF.findById(id).orElse(new Progress_flashcard());
    }

    @Override
    public void update(Progress_flashcard i) {
        pF.save(i);
    }

    @Override
    public void delete(int id) {
        pF.deleteById(id);
    }
}
