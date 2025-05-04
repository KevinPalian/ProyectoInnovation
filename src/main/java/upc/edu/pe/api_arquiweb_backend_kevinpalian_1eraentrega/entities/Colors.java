package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Colors") //Esto es un cambio de Gitbash
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColors;
    private String nameColors;
    private String ColorsPrimary;
    private String nameColorsSecundary;
    private String ColorsBackground;

    public Colors() {
    }

    public Colors(int idColors, String nameColors, String colorsPrimary, String nameColorsSecundary, String colorsBackground) {
        this.idColors = idColors;
        this.nameColors = nameColors;
        this.ColorsPrimary = colorsPrimary;
        this.nameColorsSecundary = nameColorsSecundary;
        this.ColorsBackground = colorsBackground;
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
}
