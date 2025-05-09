package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Progress_flashcard")
public class Progress_flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgress;

    @Column(name = "CorrectFlashcard", nullable = false)
    private int CorrectFlashcard;

    @Column(name = "IncorrectFlashcard", nullable = false)
    private int IncorrectFlashcard;

    @Column(name = "TimeSpentFlashcard", nullable = false)
    private int TimeSpentFlashcard;

    @Column(name = "StateFlashcard", nullable = false, length = 50)
    private String StateFlashcard;

    @OneToOne
    @JoinColumn(name = "IdFlashcard")
    private Flashcard flashcard;

    public Progress_flashcard() {
    }

    public Progress_flashcard(int idProgress, int correctFlashcard, int incorrectFlashcard, int timeSpentFlashcard, String stateFlashcard, Flashcard flashcard) {
        this.idProgress = idProgress;
        CorrectFlashcard = correctFlashcard;
        IncorrectFlashcard = incorrectFlashcard;
        TimeSpentFlashcard = timeSpentFlashcard;
        StateFlashcard = stateFlashcard;
        this.flashcard = flashcard;
    }

    public int getIdProgress() {
        return idProgress;
    }

    public void setIdProgress(int idProgress) {
        this.idProgress = idProgress;
    }

    public int getCorrectFlashcard() {
        return CorrectFlashcard;
    }

    public void setCorrectFlashcard(int correctFlashcard) {
        CorrectFlashcard = correctFlashcard;
    }

    public int getIncorrectFlashcard() {
        return IncorrectFlashcard;
    }

    public void setIncorrectFlashcard(int incorrectFlashcard) {
        IncorrectFlashcard = incorrectFlashcard;
    }

    public int getTimeSpentFlashcard() {
        return TimeSpentFlashcard;
    }

    public void setTimeSpentFlashcard(int timeSpentFlashcard) {
        TimeSpentFlashcard = timeSpentFlashcard;
    }

    public String getStateFlashcard() {
        return StateFlashcard;
    }

    public void setStateFlashcard(String stateFlashcard) {
        StateFlashcard = stateFlashcard;
    }

    public Flashcard getFlashcard() {
        return flashcard;
    }

    public void setFlashcard(Flashcard flashcard) {
        this.flashcard = flashcard;
    }
}
