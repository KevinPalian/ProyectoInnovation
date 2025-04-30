package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TemaFlashcard")
public class TemaFlashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlashcardTema;

    @Column(name = "nombreFlashcardTema",length = 30,nullable = false)
    private String nombreFlashcardTema;

    @Column(name = "fechaFlashcardTema",nullable = false)
    private LocalDate fechaFlashcardTema;

    public TemaFlashcard() {
    }

    public TemaFlashcard(int idFlashcardTema, String nombreFlashcardTema, LocalDate fechaFlashcardTema) {
        this.idFlashcardTema = idFlashcardTema;
        this.nombreFlashcardTema = nombreFlashcardTema;
        this.fechaFlashcardTema = fechaFlashcardTema;
    }

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
