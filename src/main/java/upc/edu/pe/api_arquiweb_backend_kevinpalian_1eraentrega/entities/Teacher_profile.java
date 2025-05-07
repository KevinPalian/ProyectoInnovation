package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Teacher_profile")
public class Teacher_profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTeacherProfile;

    @Column(name = "SpecialistTeacherProfile",nullable = false,length = 100)
    private String SpecialistTeacherProfile;

    @Column(name = "ExperienceTeacherProfile", nullable = false,length = 100)
    private String ExperienceTeacherProfile;

    @Column(name = "DescriptionTeacherProfile", nullable = false, length = 100)
    private String DescriptionTeacherProfile;

    @Column(name = "AverageGradeTeacherProfile", nullable = false, length = 100)
    private double AverageGradeTeacherProfile;

    @ManyToOne
    @JoinColumn(name = "IdInstitution")
    private Institution Institution;

    @ManyToOne
    @JoinColumn(name = "IdComentary")
    private Comentary Comentary;

    @ManyToOne
    @JoinColumn(name = "IdUser")
    private User User;
}
