package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Roles;

import java.util.List;

public interface IRolesService {
        public List<Roles> List();
        public void insert(Roles r);
        public Roles ListId(int id);
        public Roles searchById(int id);
        public void update(Roles r);
        public void delete(int id);

}

//public List<Institution> list();----------
//public void insert(Institution i);--------
//public Institution searchById(int id);
//public void update(Institution i);
//public void delete(int id);