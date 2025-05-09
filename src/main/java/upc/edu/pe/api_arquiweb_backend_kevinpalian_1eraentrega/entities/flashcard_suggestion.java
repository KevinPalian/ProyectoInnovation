package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

@Entity
@Table(name="flashcard_suggestion")
public class flashcard_suggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcard_suggestion;

    @Column(name="reason_suggestionSFlashcard", nullable=false)
    private String reason_suggestionSFlashcard;

    @Column(name="progress_basedSFlashcard",length = 150, nullable=false)
    private String progress_basedSFlashcard;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idFlashcardTheme")
    private FlashcardTheme flashcardTheme;

    public flashcard_suggestion() {
    }

    public flashcard_suggestion(int idFlashcard_suggestion, String reason_suggestionSFlashcard, String progress_basedSFlashcard, User user, FlashcardTheme flashcardTheme) {
        this.idFlashcard_suggestion = idFlashcard_suggestion;
        this.reason_suggestionSFlashcard = reason_suggestionSFlashcard;
        this.progress_basedSFlashcard = progress_basedSFlashcard;
        this.user = user;
        this.flashcardTheme = flashcardTheme;
    }

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
