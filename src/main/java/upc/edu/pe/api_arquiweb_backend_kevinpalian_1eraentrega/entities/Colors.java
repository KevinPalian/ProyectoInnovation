package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Colores")
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColors;
    private String nameColors;
    private String ColorsPrimario;
    private String nameColorsSecundaria;
    private String ColorsFondo;

    @ManyToOne
    @JoinColumn(name = "idFlashcard")
    private Flashcard flashcard;

    /*@ManyToOne
    @JoinColumn(name = "idTeacher_profile")
    private Teacher_profile teacher_profile;*/

    public Colors() {
    }

    public Colors(int idColors, String nameColors, String colorsPrimario, String nameColorsSecundaria, String colorsFondo, Flashcard flashcard) {
        this.idColors = idColors;
        this.nameColors = nameColors;
        this.ColorsPrimario = colorsPrimario;
        this.nameColorsSecundaria = nameColorsSecundaria;
        this.ColorsFondo = colorsFondo;
        this.flashcard = flashcard;
    }

    public int getIdColors() {
        return idColors;
    }

    public void setIdColors(int idColors) {
        this.idColors = idColors;
    }

    public String getNameColors() {
        return nameColors;
    }

    public void setNameColors(String nameColors) {
        this.nameColors = nameColors;
    }

    public String getColorsPrimario() {
        return ColorsPrimario;
    }

    public void setColorsPrimario(String colorsPrimario) {
        ColorsPrimario = colorsPrimario;
    }

    public String getNameColorsSecundaria() {
        return nameColorsSecundaria;
    }

    public void setNameColorsSecundaria(String nameColorsSecundaria) {
        this.nameColorsSecundaria = nameColorsSecundaria;
    }

    public String getColorsFondo() {
        return ColorsFondo;
    }

    public void setColorsFondo(String colorsFondo) {
        ColorsFondo = colorsFondo;
    }

    public Flashcard getFlashcard() {
        return flashcard;
    }

    public void setFlashcard(Flashcard flashcard) {
        this.flashcard = flashcard;
    }
}
