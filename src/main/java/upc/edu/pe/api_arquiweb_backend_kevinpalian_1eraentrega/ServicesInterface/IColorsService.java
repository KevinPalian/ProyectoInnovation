package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Colors;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Roles;

import java.util.List;

public interface IColorsService {
    public List<Colors> List();
    public void insert(Colors c);
    public Colors ListId(int id);

}
