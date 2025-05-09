package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Roles;

import java.util.List;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, Integer> {
    @Query(value = "select u.name_user, r.name_role \n" +
            " from roles r\n" +
            " inner join users u\n" +
            " on u.id_User=r.id_Roles",nativeQuery = true)
    List<String[]> findbyUsersandRoles();

   // @Query(value = "SELECT r.id_roles\n" +
     //       "FROM roles r \n" +
       //     "WHERE r.name_role = 'ADMIN';",nativeQuery = true)
    //public Integer ingresoidADMIN();
}
