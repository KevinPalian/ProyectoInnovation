package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcard_SuggestionService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.flashcard_suggestion;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IFlashcard_SuggestionRepository;

import java.util.List;

@Service
public class Flashcard_SuggestionServiceImplement implements IFlashcard_SuggestionService {
    @Autowired
    private IFlashcard_SuggestionRepository fsR;

    @Override
    public List<flashcard_suggestion>list() {return fsR.findAll();}

    @Override
    public void insert(flashcard_suggestion fs) {
        fsR.save(fs);
    }

    @Override
    public flashcard_suggestion searchbyId(int id) {
        return fsR.findById(id).orElse(new flashcard_suggestion());
    }

    @Override
    public void update(flashcard_suggestion fs) {
        fsR.save(fs);
    }

    @Override
    public void delete(int id) {
        fsR.deleteById(id);
    }
}
