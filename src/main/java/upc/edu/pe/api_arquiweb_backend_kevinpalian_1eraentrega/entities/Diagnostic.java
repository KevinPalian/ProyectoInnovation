package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;


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

    public Diagnostic() {
    }

    public Diagnostic(int idDiagnostic, String descriptionDiagnostic, User user) {
        this.idDiagnostic = idDiagnostic;
        this.descriptionDiagnostic = descriptionDiagnostic;
        this.user = user;
    }

    public int getIdDiagnostic() {
        return idDiagnostic;
    }

    public void setIdDiagnostic(int idDiagnostic) {
        this.idDiagnostic = idDiagnostic;
    }

    public String getDescriptionDiagnostic() {
        return descriptionDiagnostic;
    }

    public void setDescriptionDiagnostic(String descriptionDiagnostic) {
        this.descriptionDiagnostic = descriptionDiagnostic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
