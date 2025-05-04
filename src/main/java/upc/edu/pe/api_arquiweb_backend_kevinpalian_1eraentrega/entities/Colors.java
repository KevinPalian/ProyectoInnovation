package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Colores") //Esto es un cambio de Gitbash
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColors;
    private String nameColors;
    private String ColorsPrimario;
    private String nameColorsSecundaria;
    private String ColorsFondo;

    public Colors() {
    }

    public Colors(int idColors, String nameColors, String colorsPrimario, String nameColorsSecundaria, String colorsFondo) {
        this.idColors = idColors;
        this.nameColors = nameColors;
        this.ColorsPrimario = colorsPrimario;
        this.nameColorsSecundaria = nameColorsSecundaria;
        this.ColorsFondo = colorsFondo;
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
}
