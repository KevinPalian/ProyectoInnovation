package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Flashcard;

public class ColorsDTO {
    private int idColors;
    private String nameColors;
    private String ColorsPrimary;
    private String nameColorsSecundary;
    private String ColorsBackground;
    private Flashcard flashcard;

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
