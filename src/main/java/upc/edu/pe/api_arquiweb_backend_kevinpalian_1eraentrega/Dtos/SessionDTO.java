package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Teacher_profile;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

public class SessionDTO {

    private int idSession;
    private String titlesession;
    private String descriptionsession;
    private double  pricesession;
    private int durationsession;
    private User user;
    private Teacher_profile teacher_profile;

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public String getTitlesession() {
        return titlesession;
    }

    public void setTitlesession(String titlesession) {
        this.titlesession = titlesession;
    }

    public String getDescriptionsession() {
        return descriptionsession;
    }

    public void setDescriptionsession(String descriptionsession) {
        this.descriptionsession = descriptionsession;
    }

    public double getPricesession() {
        return pricesession;
    }

    public void setPricesession(double pricesession) {
        this.pricesession = pricesession;
    }

    public int getDurationsession() {
        return durationsession;
    }

    public void setDurationsession(int durationsession) {
        this.durationsession = durationsession;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Teacher_profile getTeacher_profile() {
        return teacher_profile;
    }

    public void setTeacher_profile(Teacher_profile teacher_profile) {
        this.teacher_profile = teacher_profile;
    }
}
