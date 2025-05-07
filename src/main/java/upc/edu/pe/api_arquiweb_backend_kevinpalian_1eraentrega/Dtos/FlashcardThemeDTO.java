package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Flashcard;

import java.time.LocalDate;


public class FlashcardThemeDTO {
    private int idFlashcardTheme;
    private String nameFlashcardTheme;
    private LocalDate dateFlashcardTheme;
    private Flashcard flashcard;

    public int getIdFlashcardTheme() {
        return idFlashcardTheme;
    }

    public void setIdFlashcardTheme(int idFlashcardTheme) {
        this.idFlashcardTheme = idFlashcardTheme;
    }

    public String getNameFlashcardTheme() {
        return nameFlashcardTheme;
    }

    public void setNameFlashcardTheme(String nameFlashcardTheme) {
        this.nameFlashcardTheme = nameFlashcardTheme;
    }

    public LocalDate getDateFlashcardTheme() {
        return dateFlashcardTheme;
    }

    public void setDateFlashcardTheme(LocalDate dateFlashcardTheme) {
        this.dateFlashcardTheme = dateFlashcardTheme;
    }

    public Flashcard getFlashcard() {
        return flashcard;
    }

    public void setFlashcard(Flashcard flashcard) {
        this.flashcard = flashcard;
    }
}
