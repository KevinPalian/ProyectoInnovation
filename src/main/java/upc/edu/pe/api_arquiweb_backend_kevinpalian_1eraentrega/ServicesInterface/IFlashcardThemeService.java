package pe.edu.upc.demo3157api.servicesinterfaces;

import pe.edu.upc.demo3157api.entities.FlashcardTheme;

import java.util.List;

public interface IFlashcardThemeService {
    public List<FlashcardTheme> list();
    public void insert(FlashcardTheme tF);
    public void update(FlashcardTheme tF);
    public void delete(int id);
    public FlashcardTheme searchById(int id);
    public List<FlashcardTheme> search(String n);
}
