package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

public class ColorsDTO {
    private int idColors;
    private String nameColors;
    private String ColorsPrimario;
    private String nameColorsSecundaria;
    private String ColorsFondo;

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
