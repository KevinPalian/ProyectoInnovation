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

    // ✅ Ya puedes usar el nombre del atributo correctamente
    public User findByUsername(String nameUser);

    // ✅ Nombre del parámetro corregido para que coincida con la query
    @Query("SELECT COUNT(u.username) FROM User u WHERE u.username = :username")
    int buscarUsername(@Param("username") String username);

    // ✅ Esta parte queda igual si la estructura de la tabla user_roles es correcta
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO user_roles (user_id, role_id) VALUES (:user_id, :rol_id)", nativeQuery = true)
    Integer insertUserRol(@Param("user_id") Long userId, @Param("rol_id") Long rolId);
}
