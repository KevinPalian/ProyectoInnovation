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

    @ManyToOne
    @JoinColumn(name = "IdTeacherProfile")
    private Teacher_profile teacher_profile;

    public Colors() {
    }

    public Colors(int idColors, String nameColors, String colorsPrimary, String nameColorsSecundary, String colorsBackground, Flashcard flashcard, Teacher_profile teacher_profile) {
        this.idColors = idColors;
        this.nameColors = nameColors;
        ColorsPrimary = colorsPrimary;
        this.nameColorsSecundary = nameColorsSecundary;
        ColorsBackground = colorsBackground;
        this.flashcard = flashcard;
        this.teacher_profile = teacher_profile;
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

    public Teacher_profile getTeacher_profile() {
        return teacher_profile;
    }

    public void setTeacher_profile(Teacher_profile teacher_profile) {
        this.teacher_profile = teacher_profile;
    }
}
