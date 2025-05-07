package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;



import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "nameUser", length = 100, nullable = false)
    private String nameUser;

    @Column(name = "lastnameUser", length = 100, nullable = false)
    private String lastnameUser;

    @Column(name = "emailUser", length = 250, nullable = false)
    private String emailUser;

    @Column(name = "passwordUser", length = 15, nullable = false)
    private String passwordUser;

    @Column(name = "belong_institutionUser", nullable = false)
    private Boolean belong_institutionUser;

    @Column(name = "institution_codeUser", nullable = true)
    private int institution_codeUser;

    @Column(name = "genderUser", length = 15, nullable = false)
    private String genderUser;

    @Column(name = "ageUser", nullable = false)
    private int ageUser;

    @Column(name = "phoneUser", length = 20, nullable = false)
    private String phoneUser;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )

    private Set<Roles> roles = new HashSet<>();
}
