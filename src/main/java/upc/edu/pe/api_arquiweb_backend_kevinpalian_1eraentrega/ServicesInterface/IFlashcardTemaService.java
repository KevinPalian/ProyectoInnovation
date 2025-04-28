package pe.edu.upc.demo3157api.servicesinterfaces;

import pe.edu.upc.demo3157api.entities.TemaFlashcard;

import java.util.List;

public interface IFlashcardTemaService {
    public List<TemaFlashcard> list();
    public void insert(TemaFlashcard tF);
    public void update(TemaFlashcard tF);
    public void delete(int id);
    public TemaFlashcard searchById(int id);
    public List<TemaFlashcard> search(String n);
}
