package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.FlashcardImg;

import java.util.List;

public interface IFlashcardImgService {
    public List<FlashcardImg> list();
    public void insert(FlashcardImg i);
    public void update(FlashcardImg i);
    public void delete(int id);
    public FlashcardImg searchById(int id);
}
