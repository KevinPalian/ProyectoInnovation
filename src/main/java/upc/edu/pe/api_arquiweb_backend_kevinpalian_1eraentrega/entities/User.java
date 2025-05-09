package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;



import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "nameUser", length = 100, nullable = false)
    private String nameUser;

    @Column(name = "emailUser", length = 250, nullable = false)
    private String emailUser;

    @Column(name = "passwordUser", length = 50, nullable = false)
    private String passwordUser;

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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Roles> roles = new HashSet<>();

    public User() {
    }

    public User(int idUser, String nameUser, String emailUser, String passwordUser, Boolean enabled, Boolean belong_institutionUser, int institution_codeUser, String genderUser, int ageUser, String phoneUser, Set<Roles> roles) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.enabled = enabled;
        this.belong_institutionUser = belong_institutionUser;
        this.institution_codeUser = institution_codeUser;
        this.genderUser = genderUser;
        this.ageUser = ageUser;
        this.phoneUser = phoneUser;
        this.roles = roles;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getBelong_institutionUser() {
        return belong_institutionUser;
    }

    public void setBelong_institutionUser(Boolean belong_institutionUser) {
        this.belong_institutionUser = belong_institutionUser;
    }

    public int getInstitution_codeUser() {
        return institution_codeUser;
    }

    public void setInstitution_codeUser(int institution_codeUser) {
        this.institution_codeUser = institution_codeUser;
    }

    public String getGenderUser() {
        return genderUser;
    }

    public void setGenderUser(String genderUser) {
        this.genderUser = genderUser;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }
}
