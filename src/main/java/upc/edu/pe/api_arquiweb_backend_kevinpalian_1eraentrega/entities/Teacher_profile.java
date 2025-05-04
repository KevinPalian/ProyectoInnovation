package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

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

    public Teacher_profile(int idTeacherProfile, String specialistTeacherProfile, String experienceTeacherProfile, String descriptionTeacherProfile, double averageGradeTeacherProfile, Institution institution, Comentary comentary, User user) {
        this.IdTeacherProfile = idTeacherProfile;
        this.SpecialistTeacherProfile = specialistTeacherProfile;
        this.ExperienceTeacherProfile = experienceTeacherProfile;
        this.DescriptionTeacherProfile = descriptionTeacherProfile;
        this.AverageGradeTeacherProfile = averageGradeTeacherProfile;
        this.Institution = institution;
        this.Comentary = comentary;
        this.User = user;
    }

    public int getIdTeacherProfile() {
        return IdTeacherProfile;
    }

    public void setIdTeacherProfile(int idTeacherProfile) {
        this.IdTeacherProfile = idTeacherProfile;
    }

    public String getSpecialistTeacherProfile() {
        return SpecialistTeacherProfile;
    }

    public void setSpecialistTeacherProfile(String specialistTeacherProfile) {
        this.SpecialistTeacherProfile = specialistTeacherProfile;
    }

    public String getExperienceTeacherProfile() {
        return ExperienceTeacherProfile;
    }

    public void setExperienceTeacherProfile(String experienceTeacherProfile) {
        this.ExperienceTeacherProfile = experienceTeacherProfile;
    }

    public String getDescriptionTeacherProfile() {
        return DescriptionTeacherProfile;
    }

    public void setDescriptionTeacherProfile(String descriptionTeacherProfile) {
        this.DescriptionTeacherProfile = descriptionTeacherProfile;
    }

    public double getAverageGradeTeacherProfile() {
        return AverageGradeTeacherProfile;
    }

    public void setAverageGradeTeacherProfile(double averageGradeTeacherProfile) {
        this.AverageGradeTeacherProfile = averageGradeTeacherProfile;
    }

    public Institution getInstitution() {
        return Institution;
    }

    public void setInstitution(Institution institution) {
        this.Institution = institution;
    }

    public Comentary getComentary() {
        return Comentary;
    }

    public void setComentary(Comentary comentary) {
        this.Comentary = comentary;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        this.User = user;
    }
}
