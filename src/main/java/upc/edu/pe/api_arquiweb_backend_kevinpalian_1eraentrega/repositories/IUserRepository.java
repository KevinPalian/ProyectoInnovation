package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Roles;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
