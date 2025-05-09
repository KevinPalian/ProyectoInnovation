package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

public class Teacher_profileDTO {
    private int IdTeacherProfile;
    private String SpecialistTeacherProfile;
    private String ExperienceTeacherProfile;
    private String DescriptionTeacherProfile;
    private double AverageGradeTeacherProfile;
    private Institution Institution;
    private Comentary Comentary;
    private User User;

    public int getIdTeacherProfile() {
        return IdTeacherProfile;
    }

    public void setIdTeacherProfile(int idTeacherProfile) {
        IdTeacherProfile = idTeacherProfile;
    }

    public String getSpecialistTeacherProfile() {
        return SpecialistTeacherProfile;
    }

    public void setSpecialistTeacherProfile(String specialistTeacherProfile) {
        SpecialistTeacherProfile = specialistTeacherProfile;
    }

    public String getExperienceTeacherProfile() {
        return ExperienceTeacherProfile;
    }

    public void setExperienceTeacherProfile(String experienceTeacherProfile) {
        ExperienceTeacherProfile = experienceTeacherProfile;
    }

    public String getDescriptionTeacherProfile() {
        return DescriptionTeacherProfile;
    }

    public void setDescriptionTeacherProfile(String descriptionTeacherProfile) {
        DescriptionTeacherProfile = descriptionTeacherProfile;
    }

    public double getAverageGradeTeacherProfile() {
        return AverageGradeTeacherProfile;
    }

    public void setAverageGradeTeacherProfile(double averageGradeTeacherProfile) {
        AverageGradeTeacherProfile = averageGradeTeacherProfile;
    }

    public upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution getInstitution() {
        return Institution;
    }

    public void setInstitution(upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution institution) {
        Institution = institution;
    }

    public upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary getComentary() {
        return Comentary;
    }

    public void setComentary(upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary comentary) {
        Comentary = comentary;
    }

    public upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User getUser() {
        return User;
    }

    public void setUser(upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User user) {
        User = user;
    }
}
