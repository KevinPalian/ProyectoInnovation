package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import java.time.LocalDate;

public class FlashcardTemaDTO {
    private int idFlashcardTema;
    private String nombreFlashcardTema;
    private LocalDate fechaFlashcardTema;

    public int getIdFlashcardTema() {
        return idFlashcardTema;
    }

    public void setIdFlashcardTema(int idFlashcardTema) {
        this.idFlashcardTema = idFlashcardTema;
    }

    public String getNombreFlashcardTema() {
        return nombreFlashcardTema;
    }

    public void setNombreFlashcardTema(String nombreFlashcardTema) {
        this.nombreFlashcardTema = nombreFlashcardTema;
    }

    public LocalDate getFechaFlashcardTema() {
        return fechaFlashcardTema;
    }

    public void setFechaFlashcardTema(LocalDate fechaFlashcardTema) {
        this.fechaFlashcardTema = fechaFlashcardTema;
    }
}
