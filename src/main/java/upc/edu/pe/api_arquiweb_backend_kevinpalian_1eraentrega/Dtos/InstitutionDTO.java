package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;


import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

public class InstitutionDTO {
    private int idInstituion;
    private String nameInstitution;
    private String rucInstitution;
    private String code_securityInstitution;
    private User user;

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
