package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Flashcard;

import java.util.List;

public interface IFlashcardService {
    public List<Flashcard> list();
    public void insert(Flashcard f);
    public Flashcard searchbyId(int id);
    public void update(Flashcard f);
    public void delete(int id);
}
