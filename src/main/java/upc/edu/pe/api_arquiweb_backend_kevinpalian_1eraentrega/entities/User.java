package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;



import jakarta.persistence.*;


@Entity
@Table(name="User")
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

    public User() {
    }

    public User(int idUser, String nameUser, String lastnameUser, String emailUser, String passwordUser, Boolean belong_institutionUser, int institution_codeUser, String genderUser, int ageUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.lastnameUser = lastnameUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.belong_institutionUser = belong_institutionUser;
        this.institution_codeUser = institution_codeUser;
        this.genderUser = genderUser;
        this.ageUser = ageUser;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
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

    public String getLastnameUser() {
        return lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
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
}
