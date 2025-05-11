package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

public class UserDTO {
    private int idUser;
    private String nameUser;
    private String lastnameUser;
    private String emailUser;
    @JsonIgnore
    private String passwordUser;
    private Boolean belong_institutionUser;
    private int institution_codeUser;
    private String genderUser;
    private int ageUser;
    private String phoneUser;

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

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }
}
