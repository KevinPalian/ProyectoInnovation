package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.FlashcardTheme;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IFlashcardThemeRepository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IFlashcardThemeService;

import java.util.List;
@Service
public class FlashcardThemeServiceImplement implements IFlashcardThemeService {
    @Autowired
    private IFlashcardThemeRepository tfR;

    @Override
    public List<FlashcardTheme> list() {
        return tfR.findAll();
    }

    @Override
    public void insert(FlashcardTheme tF) {
        tfR.save(tF);
    }

    @Override
    public void update(FlashcardTheme tF) {
        tfR.save(tF);
    }

    @Override
    public void delete(int id) {
        tfR.deleteById(id);
    }

    @Override
    public FlashcardTheme searchById(int id) {
        return tfR.findById(id).orElse(new FlashcardTheme());
    }

    @Override
    public List<FlashcardTheme> search(String n){
        return tfR.buscar(n);
    }
}
