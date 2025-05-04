package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Colors") //Esto es un cambio de Gitbash
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColors;
    @Column(name = "nameColors",length = 50,nullable = false)
    private String nameColors;
    @Column(name = "ColorsPrimary",length = 50,nullable = false)
    private String ColorsPrimary;
    @Column(name = "nameColorsSecundary",length = 50,nullable = false)
    private String nameColorsSecundary;
    @Column(name = "ColorsBackground",length = 50,nullable = false)
    private String ColorsBackground;

    @ManyToOne
    @JoinColumn(name = "idFlashcard")
    private Flashcard flashcard;

    /*@ManyToOne
    @JoinColumn(name = "idTeacher_profile")
    private Teacher_profile teacher_profile;*/

    public Colors() {
    }

    public Colors(int idColors, String nameColors, String colorsPrimary, String nameColorsSecundary, String colorsBackground, Flashcard flashcard) {
        this.idColors = idColors;
        this.nameColors = nameColors;
        this.ColorsPrimary = colorsPrimary;
        this.nameColorsSecundary = nameColorsSecundary;
        this.ColorsBackground = colorsBackground;
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

    public String getColorsPrimary() {
        return ColorsPrimary;
    }

    public void setColorsPrimary(String colorsPrimary) {
        ColorsPrimary = colorsPrimary;
    }

    public String getNameColorsSecundary() {
        return nameColorsSecundary;
    }

    public void setNameColorsSecundary(String nameColorsSecundary) {
        this.nameColorsSecundary = nameColorsSecundary;
    }

    public String getColorsBackground() {
        return ColorsBackground;
    }

    public void setColorsBackground(String colorsBackground) {
        ColorsBackground = colorsBackground;
    }

    public Flashcard getFlashcard() {
        return flashcard;
    }

    public void setFlashcard(Flashcard flashcard) {
        this.flashcard = flashcard;
    }
}
