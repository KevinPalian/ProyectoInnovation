package pe.edu.upc.demo3157api.servicesinterfaces;

import pe.edu.upc.demo3157api.entities.FlashcardImg;

import java.util.List;

public interface IFlashcardImgService {
    public List<FlashcardImg> list();
    public void insert(FlashcardImg i);
    public void update(FlashcardImg i);
    public void delete(int id);
    public FlashcardImg searchById(int id);
}
