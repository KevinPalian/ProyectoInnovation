package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary;

import java.util.List;

@Repository
public interface IComentaryRepository extends JpaRepository<Comentary, Integer> {

    @Query(value = "SELECT u.id_user, u.name_user, u.lastname_user, u.institution_code_user, count(c.id_user) as cantidad_comentarios\n" +
            "FROM Comentary c INNER JOIN Users u\n" +
            "ON c.id_user = u.id_user\n" +
            "GROUP BY u.id_user, u.name_user, u.lastname_user, u.institution_code_user",nativeQuery = true)
    public List<String[]> quantityCommentByUser();
}
