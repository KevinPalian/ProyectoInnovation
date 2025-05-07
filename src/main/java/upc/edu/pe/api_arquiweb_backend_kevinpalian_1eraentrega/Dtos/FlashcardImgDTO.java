package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Flashcard;

public class FlashcardImgDTO {
    private int idFlashcardImg;
    private String urlFlashcardImg;
    private String descFlashcardImg;
    private Flashcard flashcard;

    public int getIdFlashcardImg() {
        return idFlashcardImg;
    }

    public void setIdFlashcardImg(int idFlashcardImg) {
        this.idFlashcardImg = idFlashcardImg;
    }

    public String getUrlFlashcardImg() {
        return urlFlashcardImg;
    }

    public void setUrlFlashcardImg(String urlFlashcardImg) {
        this.urlFlashcardImg = urlFlashcardImg;
    }

    public String getDescFlashcardImg() {
        return descFlashcardImg;
    }

    public void setDescFlashcardImg(String descFlashcardImg) {
        this.descFlashcardImg = descFlashcardImg;
    }

    public Flashcard getFlashcard() {
        return flashcard;
    }

    public void setFlashcard(Flashcard flashcard) {
        this.flashcard = flashcard;
    }
}
