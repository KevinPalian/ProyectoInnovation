package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;
import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="Institution")
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInstituion;

    @Column(name = "nameInstitution", length = 250, nullable = false)
    private String nameInstitution;

    @Column(name = "rucInstitution", length = 25, nullable = false)
    private String rucInstitution;

    @Column(name = "code_securityInstitution", length = 15, nullable = false)
    private String code_securityInstitution;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
}
