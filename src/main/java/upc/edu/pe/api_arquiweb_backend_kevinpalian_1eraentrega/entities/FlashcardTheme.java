package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "FlashcardTheme")
public class FlashcardTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcardTheme;

    @Column(name = "nameFlashcardTheme",length = 30,nullable = false)
    private String nameFlashcardTheme;

    @Column(name = "dateFlashcardTheme",nullable = false)
    private LocalDate dateFlashcardTheme;

    @ManyToOne
    @JoinColumn(name = "idFlashcard")
    private Flashcard flashcard;

    public FlashcardTheme() {
    }

    public FlashcardTheme(int idFlashcardTheme, String nameFlashcardTheme, LocalDate dateFlashcardTheme, Flashcard flashcard) {
        this.idFlashcardTheme = idFlashcardTheme;
        this.nameFlashcardTheme = nameFlashcardTheme;
        this.dateFlashcardTheme = dateFlashcardTheme;
        this.flashcard = flashcard;
    }

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
