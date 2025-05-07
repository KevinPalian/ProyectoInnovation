package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Teacher_profile;

import java.util.List;

public interface ITeacher_profileRepository extends JpaRepository<Teacher_profile, Integer> {
    @Query(value = "SELECT u.name_user, u.lastname_user, t.Specialist_Teacher_Profile, t.Experience_Teacher_Profile \n" +
            " FROM Users u \n" +
            " JOIN Teacher_profile t\n" +
            " ON u.Id_User = t.id_teacher_profile;",nativeQuery = true)
    List<String[]> getAllTeacherProfiles();
}
