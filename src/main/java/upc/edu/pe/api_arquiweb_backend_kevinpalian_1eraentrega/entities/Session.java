package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="Sesion")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSession;

    @Column(name = "titlesession", nullable = false, length = 50)
    private String titlesession;

    @Column(name = "descriptionsession", nullable = false, length = 50)
    private String descriptionsession;

    @Column(name = "pricesession", nullable = false)
    private double  pricesession;

    @Column(name = "durationsession", nullable = false)
    private int durationsession;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "IdTeacherProfile")
    private Teacher_profile teacher_profile;
}





















