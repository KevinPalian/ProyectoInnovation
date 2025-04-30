package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.TemaFlashcard;

import java.util.List;

public interface IFlashcardTemaService {
    public List<TemaFlashcard> list();
    public void insert(TemaFlashcard tF);
    public void update(TemaFlashcard tF);
    public void delete(int id);
    public TemaFlashcard searchById(int id);
    public List<TemaFlashcard> search(String n);
}
