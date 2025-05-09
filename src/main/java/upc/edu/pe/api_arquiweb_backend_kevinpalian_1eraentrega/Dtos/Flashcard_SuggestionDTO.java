package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;
import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.FlashcardTheme;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

public class Flashcard_SuggestionDTO {
    private int idFlashcard_suggestion;
    private String reason_suggestionSFlashcard;
    private String progress_basedSFlashcard;
    private User user;
    private FlashcardTheme flashcardTheme;

    public int getIdFlashcard_suggestion() {
        return idFlashcard_suggestion;
    }

    public void setIdFlashcard_suggestion(int idFlashcard_suggestion) {
        this.idFlashcard_suggestion = idFlashcard_suggestion;
    }

    public String getReason_suggestionSFlashcard() {
        return reason_suggestionSFlashcard;
    }

    public void setReason_suggestionSFlashcard(String reason_suggestionSFlashcard) {
        this.reason_suggestionSFlashcard = reason_suggestionSFlashcard;
    }

    public String getProgress_basedSFlashcard() {
        return progress_basedSFlashcard;
    }

    public void setProgress_basedSFlashcard(String progress_basedSFlashcard) {
        this.progress_basedSFlashcard = progress_basedSFlashcard;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FlashcardTheme getFlashcardTheme() {
        return flashcardTheme;
    }

    public void setFlashcardTheme(FlashcardTheme flashcardTheme) {
        this.flashcardTheme = flashcardTheme;
    }
}
