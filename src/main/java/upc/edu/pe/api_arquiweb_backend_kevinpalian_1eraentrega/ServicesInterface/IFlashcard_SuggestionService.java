package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.flashcard_suggestion;

import java.util.List;

public interface IFlashcard_SuggestionService {
    public List<flashcard_suggestion> list();
    public void insert(flashcard_suggestion fs);
    public flashcard_suggestion searchbyId(int id);
    public void update(flashcard_suggestion fs);
    public void delete(int id);
}
