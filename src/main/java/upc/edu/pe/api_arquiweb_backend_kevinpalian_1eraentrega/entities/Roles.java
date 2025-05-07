package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoles;

    @Column(name = "nameRole",length = 50, nullable = false)
    private String nameRole;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
}

