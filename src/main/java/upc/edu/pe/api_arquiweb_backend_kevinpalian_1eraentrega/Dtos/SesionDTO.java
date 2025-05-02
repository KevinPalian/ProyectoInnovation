package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

public class SesionDTO {

    private int idSesion;

    private String tituloSesion;
    private String descripcionSesion;
    private double  precioSesion;
    private int duracionSesion;


    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public String getTituloSesion() {
        return tituloSesion;
    }

    public void setTituloSesion(String tituloSesion) {
        this.tituloSesion = tituloSesion;
    }

    public String getDescripcionSesion() {
        return descripcionSesion;
    }

    public void setDescripcionSesion(String descripcionSesion) {
        this.descripcionSesion = descripcionSesion;
    }

    public double getPrecioSesion() {
        return precioSesion;
    }

    public void setPrecioSesion(double precioSesion) {
        this.precioSesion = precioSesion;
    }

    public int getDuracionSesion() {
        return duracionSesion;
    }

    public void setDuracionSesion(int duracionSesion) {
        this.duracionSesion = duracionSesion;
    }
}
