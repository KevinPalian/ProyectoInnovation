package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface.IRolesService;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Roles;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IRolesRepository;

import java.util.List;
@Service
public class RolesSerciveImplement implements IRolesService {
    @Autowired
    private IRolesRepository rR;

    @Override
    public List<Roles> List() {
        return rR.findAll();
    }

    @Override
    public void insert(Roles r) {
rR.save(r);
    }

    @Override
    public Roles ListId(int id) {
        return rR.findById(id).orElse(new Roles());
    }
//-----------------------------------
    @Override
    public Roles searchById(int id) {
        return null;
    }

    @Override
    public void update(Roles r) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<String[]> findbyUsersandRoles() {
        return rR.findbyUsersandRoles();
    }

    //@Override
    //ublic Integer ingresoidADMIN() {
      //  return rR.ingresoidADMIN();
    }

