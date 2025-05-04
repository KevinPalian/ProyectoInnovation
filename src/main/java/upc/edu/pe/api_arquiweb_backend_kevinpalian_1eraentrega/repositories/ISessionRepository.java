package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session;

@Repository
public interface ISessionRepository extends JpaRepository<Session, Integer> {



}
