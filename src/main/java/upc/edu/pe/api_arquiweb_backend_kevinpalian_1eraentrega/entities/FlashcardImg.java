package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "FlashcardImg")
public class FlashcardImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcardImg;

    @Column(name = "urlFlashcardImg",length = 100,nullable = false)
    private String urlFlashcardImg;

    @Column(name = "descFlashcardImg",length = 200,nullable = false)
    private String descFlashcardImg;

    @ManyToOne
    @JoinColumn(name = "idFlashcard")
    private Flashcard flashcard;

    public FlashcardImg() {
    }

    public FlashcardImg(int idFlashcardImg, String urlFlashcardImg, String descFlashcardImg, Flashcard flashcard) {
        this.idFlashcardImg = idFlashcardImg;
        this.urlFlashcardImg = urlFlashcardImg;
        this.descFlashcardImg = descFlashcardImg;
        this.flashcard = flashcard;
    }

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
