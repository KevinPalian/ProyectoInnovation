package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;


import jakarta.persistence.*;

@Entity
@Table(name="Sesion")
public class Sesion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSesion;


    @Column(name = "tituloSesion", nullable = false, length = 50)
    private String tituloSesion;


    @Column(name = "descripcionSesion", nullable = false, length = 50)
    private String descripcionSesion;

    @Column(name = "precioSesion", nullable = false)
    private double  precioSesion;

    @Column(name = "duracionSesion", nullable = false)
    private int duracionSesion;

    public Sesion() {
    }

    public Sesion(int idSesion, int duracionSesion, double precioSesion, String descripcionSesion, String tituloSesion) {
        this.idSesion = idSesion;
        this.duracionSesion = duracionSesion;
        this.precioSesion = precioSesion;
        this.descripcionSesion = descripcionSesion;
        this.tituloSesion = tituloSesion;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public int getDuracionSesion() {
        return duracionSesion;
    }

    public void setDuracionSesion(int duracionSesion) {
        this.duracionSesion = duracionSesion;
    }

    public double getPrecioSesion() {
        return precioSesion;
    }

    public void setPrecioSesion(double precioSesion) {
        this.precioSesion = precioSesion;
    }

    public String getDescripcionSesion() {
        return descripcionSesion;
    }

    public void setDescripcionSesion(String descripcionSesion) {
        this.descripcionSesion = descripcionSesion;
    }

    public String getTituloSesion() {
        return tituloSesion;
    }

    public void setTituloSesion(String tituloSesion) {
        this.tituloSesion = tituloSesion;
    }
}
