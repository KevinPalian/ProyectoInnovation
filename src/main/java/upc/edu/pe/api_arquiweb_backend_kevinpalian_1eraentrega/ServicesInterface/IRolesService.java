package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Roles;

import java.util.List;

public interface IRolesService {
        public List<Roles> List();
        public void insert(Roles r);
        public Roles ListId(int id);

}
