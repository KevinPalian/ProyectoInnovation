package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

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

    public Roles() {
    }

    public Roles(int idRoles, String nameRole, User user) {
        this.idRoles = idRoles;
        this.nameRole = nameRole;
        this.user = user;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

