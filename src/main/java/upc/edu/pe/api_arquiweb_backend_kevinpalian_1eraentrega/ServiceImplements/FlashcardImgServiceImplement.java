package pe.edu.upc.demo3157api.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo3157api.entities.FlashcardImg;
import pe.edu.upc.demo3157api.repositories.IFlashcardImgRepository;
import pe.edu.upc.demo3157api.servicesinterfaces.IFlashcardImgService;

import java.util.List;
@Service
public class FlashcardImgServiceImplement implements IFlashcardImgService {
    @Autowired
    private IFlashcardImgRepository iR;

    @Override
    public List<FlashcardImg> list() {
        return iR.findAll();
    }

    @Override
    public void insert(FlashcardImg i) {
        iR.save(i);
    }

    @Override
    public void update(FlashcardImg i) { iR.save(i); }

    @Override
    public void delete(int id) { iR.deleteById(id); }

    @Override
    public FlashcardImg searchById(int id) {
        return iR.findById(id).orElse(new FlashcardImg());
    }
}
