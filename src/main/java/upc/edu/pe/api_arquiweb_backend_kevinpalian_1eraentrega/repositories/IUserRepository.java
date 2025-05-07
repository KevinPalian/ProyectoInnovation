package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    public User findOneByNameUser(String nameUser);

    @Query("select count(u.nameUser) from User u where u.nameUser =:username")
    public int buscarUsername(@Param("nameUser") String nombre);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO user_roles (user_id, role_id ) VALUES (:user_id, :rol_id)", nativeQuery = true)
    public Integer insertUserRol(@Param("user_id") Long user_id, @Param("rol_id") Long rol_id);
}
