package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.FlashcardTheme;

import java.util.List;

@Repository
public interface IFlashcardThemeRepository extends JpaRepository<FlashcardTheme, Integer> {
    @Query("select tf from FlashcardTheme tf where tf.nameFlashcardTheme like %:nombre%")
    public List<FlashcardTheme> buscar(@Param("nombre") String nombre);
}
