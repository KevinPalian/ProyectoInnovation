package pe.edu.upc.demo3157api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo3157api.entities.ImagenesFlashcard;
@Repository
public interface IFlashcardImgRepository extends JpaRepository<ImagenesFlashcard, Integer> {
}
