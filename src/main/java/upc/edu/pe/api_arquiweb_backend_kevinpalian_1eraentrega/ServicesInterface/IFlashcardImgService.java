package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.ImagenesFlashcard;

import java.util.List;

public interface IFlashcardImgService {
    public List<ImagenesFlashcard> list();
    public void insert(ImagenesFlashcard i);
    public void update(ImagenesFlashcard i);
    public void delete(int id);
    public ImagenesFlashcard searchById(int id);
}
