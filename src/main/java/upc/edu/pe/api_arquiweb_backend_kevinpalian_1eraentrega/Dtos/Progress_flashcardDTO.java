package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Flashcard;


public class Progress_flashcardDTO {
    private int idProgress;
    private int CorrectFlashcard;
    private int IncorrectFlashcard;
    private int TimeSpentFlashcard;
    private String StateFlashcard;
    private Flashcard flashcard;

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
