package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import jakarta.persistence.Column;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

public class DiagnosticDTO {
    private int idDiagnostic;
    private String descriptionDiagnostic;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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
}
