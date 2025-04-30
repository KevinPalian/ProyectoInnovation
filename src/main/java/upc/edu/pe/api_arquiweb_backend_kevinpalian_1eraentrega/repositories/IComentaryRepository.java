package pe.edu.upc.demo3157api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo3157api.entities.Comentary;
@Repository
public interface IComentaryRepository extends JpaRepository<Comentary, Integer> {
}
