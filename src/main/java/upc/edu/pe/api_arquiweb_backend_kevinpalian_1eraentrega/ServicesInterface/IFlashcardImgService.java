package pe.edu.upc.demo3157api.servicesinterfaces;

import pe.edu.upc.demo3157api.entities.ImagenesFlashcard;

import java.util.List;

public interface IFlashcardImgService {
    public List<ImagenesFlashcard> list();
    public void insert(ImagenesFlashcard i);
    public void update(ImagenesFlashcard i);
    public void delete(int id);
    public ImagenesFlashcard searchById(int id);
}
