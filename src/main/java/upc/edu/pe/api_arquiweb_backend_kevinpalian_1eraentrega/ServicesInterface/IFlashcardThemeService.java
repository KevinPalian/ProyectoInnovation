package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.FlashcardTheme;

import java.util.List;

public interface IFlashcardThemeService {
    public List<FlashcardTheme> list();
    public void insert(FlashcardTheme tF);
    public void update(FlashcardTheme tF);
    public void delete(int id);
    public FlashcardTheme searchById(int id);
    public List<FlashcardTheme> search(String n);
}
