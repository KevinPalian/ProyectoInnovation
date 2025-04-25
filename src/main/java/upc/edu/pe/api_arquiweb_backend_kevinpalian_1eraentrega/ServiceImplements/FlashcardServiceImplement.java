package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcardService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Flashcard;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IFlashcardRepository;

import java.util.List;

@Service
public class FlashcardServiceImplement implements IFlashcardService {
    @Autowired
    private IFlashcardRepository fR;

    @Override
    public List<Flashcard> list() {return fR.findAll(); }
}
