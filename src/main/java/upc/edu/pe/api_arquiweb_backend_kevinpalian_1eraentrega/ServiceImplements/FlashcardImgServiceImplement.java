package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.ImagenesFlashcard;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IFlashcardImgRepository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcardImgService;

import java.util.List;
@Service
public class FlashcardImgServiceImplement implements IFlashcardImgService {
    @Autowired
    private IFlashcardImgRepository iR;

    @Override
    public List<ImagenesFlashcard> list() {
        return iR.findAll();
    }

    @Override
    public void insert(ImagenesFlashcard i) {
        iR.save(i);
    }

    @Override
    public void update(ImagenesFlashcard i) { iR.save(i); }

    @Override
    public void delete(int id) { iR.deleteById(id); }

    @Override
    public ImagenesFlashcard searchById(int id) {
        return iR.findById(id).orElse(new ImagenesFlashcard());
    }
}
