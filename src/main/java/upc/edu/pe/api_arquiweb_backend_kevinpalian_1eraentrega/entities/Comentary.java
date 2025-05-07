package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Comentary")
public class Comentary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentary;

    @Column(name = "textComentary",length = 100,nullable = false)
    private String textComentary;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
}
