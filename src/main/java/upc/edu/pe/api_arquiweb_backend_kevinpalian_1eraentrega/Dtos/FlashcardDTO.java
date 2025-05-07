package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

import java.time.LocalDate;

public class FlashcardDTO {
    private int idFlashcard;
    private String descriptionFlashcard;
    private String type_contentFlashcard;
    private String difficultyFlashcard;
    private Boolean editableFlashcard;
    private LocalDate creation_DateFlashcard;
    private String voice_languageFlashcard;
    private User user;

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

    public LocalDate getCreation_DateFlashcard() {
        return creation_DateFlashcard;
    }

    public void setCreation_DateFlashcard(LocalDate creation_DateFlashcard) {
        this.creation_DateFlashcard = creation_DateFlashcard;
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
}
