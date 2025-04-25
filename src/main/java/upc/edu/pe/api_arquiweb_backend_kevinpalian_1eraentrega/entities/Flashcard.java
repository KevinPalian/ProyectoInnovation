package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Flashcard")
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcard;

    @Column(name = "descriptionFlashcard", length = 255, nullable = false)
    private String descriptionFlashcard;

    @Column(name ="type_contentFlashcard", length = 255, nullable = false)
    private String type_contentFlashcard;

    @Column(name = "difficultyFlashcard", length = 100, nullable = false)
    private String difficultyFlashcard;

    @Column(name = "editableFlashcard", nullable = false)
    private Boolean editableFlashcard;

    @Column(name = "creation_dateFlashcard", nullable = false)
    private LocalDate creation_dateFlashcard;

    @Column(name = "voice_languageFlashcard", length = 50 ,nullable = false)
    private String voice_languageFlashcard;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;


    /*@ManyToOne
    @JoinColumn(name = "idTeacher_profile")
    private Teacher_profile teacher_profile;*/

    public Flashcard() {
    }

    public Flashcard(int idFlashcard, String descriptionFlashcard, String type_contentFlashcard, String difficultyFlashcard, Boolean editableFlashcard, LocalDate creation_dateFlashcard, String voice_languageFlashcard, User user) {
        this.idFlashcard = idFlashcard;
        this.descriptionFlashcard = descriptionFlashcard;
        this.type_contentFlashcard = type_contentFlashcard;
        this.difficultyFlashcard = difficultyFlashcard;
        this.editableFlashcard = editableFlashcard;
        this.creation_dateFlashcard = creation_dateFlashcard;
        this.voice_languageFlashcard = voice_languageFlashcard;
        this.user = user;
    }

    public int getIdFlashcard() {
        return idFlashcard;
    }

    public void setIdFlashcard(int idFlashcard) {
        this.idFlashcard = idFlashcard;
    }

    public String getDescriptionFlashcard() {
        return descriptionFlashcard;
    }

    public void setDescriptionFlashcard(String descriptionFlashcard) {
        this.descriptionFlashcard = descriptionFlashcard;
    }

    public String getType_contentFlashcard() {
        return type_contentFlashcard;
    }

    public void setType_contentFlashcard(String type_contentFlashcard) {
        this.type_contentFlashcard = type_contentFlashcard;
    }

    public String getDifficultyFlashcard() {
        return difficultyFlashcard;
    }

    public void setDifficultyFlashcard(String difficultyFlashcard) {
        this.difficultyFlashcard = difficultyFlashcard;
    }

    public Boolean getEditableFlashcard() {
        return editableFlashcard;
    }

    public void setEditableFlashcard(Boolean editableFlashcard) {
        this.editableFlashcard = editableFlashcard;
    }

    public LocalDate getCreation_dateFlashcard() {
        return creation_dateFlashcard;
    }

    public void setCreation_dateFlashcard(LocalDate creation_dateFlashcard) {
        this.creation_dateFlashcard = creation_dateFlashcard;
    }

    public String getVoice_languageFlashcard() {
        return voice_languageFlashcard;
    }

    public void setVoice_languageFlashcard(String voice_languageFlashcard) {
        this.voice_languageFlashcard = voice_languageFlashcard;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /*public Teacher_profile getTeacher_profile() {
        return teacher_profile;
    }

    public void setTeacher_profile(Teacher_profile teacher_profile) {
        this.teacher_profile = teacher_profile;
    }*/
}
