package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "username", length = 100, nullable = false)
    private String username;

    @Column(name = "emailUser", length = 250, nullable = false)
    private String emailUser;

<<<<<<< HEAD
    @Column(name = "password", length = 200, nullable = false)
    private String password;
=======
    @Column(name = "passwordUser", length = 200, nullable = false)
    private String passwordUser;
>>>>>>> 5e9f577cf2a1aa05c3d2fef974137009285ca73e

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;

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

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Roles> roles = new ArrayList<>();
}
