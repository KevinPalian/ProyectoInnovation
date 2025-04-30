package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;
import jakarta.persistence.*;


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

    public Institution() {
    }

    public Institution(int idInstituion, String nameInstitution, String rucInstitution, String code_securityInstitution, User user) {
        this.idInstituion = idInstituion;
        this.nameInstitution = nameInstitution;
        this.rucInstitution = rucInstitution;
        this.code_securityInstitution = code_securityInstitution;
        this.user = user;
    }

    public int getIdInstituion() {
        return idInstituion;
    }

    public void setIdInstituion(int idInstituion) {
        this.idInstituion = idInstituion;
    }

    public String getNameInstitution() {
        return nameInstitution;
    }

    public void setNameInstitution(String nameInstitution) {
        this.nameInstitution = nameInstitution;
    }

    public String getRucInstitution() {
        return rucInstitution;
    }

    public void setRucInstitution(String rucInstitution) {
        this.rucInstitution = rucInstitution;
    }

    public String getCode_securityInstitution() {
        return code_securityInstitution;
    }

    public void setCode_securityInstitution(String code_securityInstitution) {
        this.code_securityInstitution = code_securityInstitution;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
