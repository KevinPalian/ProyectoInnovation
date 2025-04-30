package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.TemaFlashcard;


import java.util.List;

@Repository
public interface IFlashcardTemaRepository extends JpaRepository<TemaFlashcard, Integer> {
    @Query("select tf from TemaFlashcard tf where tf.nombreFlashcardTema like %:nombre%")
    public List<TemaFlashcard> buscar(@Param("nombre") String nombre);
}
