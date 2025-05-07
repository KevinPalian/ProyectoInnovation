package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Teacher_profile")
public class Teacher_profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTeacherProfile;

    @Column(name = "SpecialistTeacherProfile",nullable = false,length = 100)
    private String SpecialistTeacherProfile;

    @Column(name = "ExperienceTeacherProfile", nullable = false,length = 100)
    private String ExperienceTeacherProfile;

    @Column(name = "DescriptionTeacherProfile", nullable = false, length = 100)
    private String DescriptionTeacherProfile;

    @Column(name = "AverageGradeTeacherProfile", nullable = false, length = 100)
    private double AverageGradeTeacherProfile;

    @ManyToOne
    @JoinColumn(name = "IdInstitution")
    private Institution Institution;

    @ManyToOne
    @JoinColumn(name = "IdComentary")
    private Comentary Comentary;

    @ManyToOne
    @JoinColumn(name = "IdUser")
    private User User;

    public Teacher_profile() {
    }

    public Teacher_profile(int idTeacherProfile, String specialistTeacherProfile, String experienceTeacherProfile, String descriptionTeacherProfile, double averageGradeTeacherProfile, upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Institution institution, upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Comentary comentary, upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User user) {
        IdTeacherProfile = idTeacherProfile;
        SpecialistTeacherProfile = specialistTeacherProfile;
        ExperienceTeacherProfile = experienceTeacherProfile;
        DescriptionTeacherProfile = descriptionTeacherProfile;
        AverageGradeTeacherProfile = averageGradeTeacherProfile;
        Institution = institution;
        Comentary = comentary;
        User = user;
    }

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

