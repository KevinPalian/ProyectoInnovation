package pe.edu.upc.demo3157api.dtos;

import java.time.LocalDate;

public class FlashcardThemeDTO {
    private int idFlashcardTheme;
    private String nameFlashcardTheme;
    private LocalDate dateFlashcardTheme;

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
}
