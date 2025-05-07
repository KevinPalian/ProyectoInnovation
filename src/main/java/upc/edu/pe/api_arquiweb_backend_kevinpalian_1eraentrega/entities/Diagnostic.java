package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Diagnostic")
public class Diagnostic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiagnostic;

    @Column(name = "descriptionDiagnostic", nullable = false)
    private String descriptionDiagnostic;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
}
