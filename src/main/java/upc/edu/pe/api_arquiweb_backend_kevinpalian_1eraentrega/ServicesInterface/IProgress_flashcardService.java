package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Progress_flashcard;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session_rating;

import java.util.List;

public interface IProgress_flashcardService {
    public List<Progress_flashcard> list();
    public void insert(Progress_flashcard i);
    public Progress_flashcard searchById(int id);
    public void update(Progress_flashcard i);
    public void delete(int id);
}
