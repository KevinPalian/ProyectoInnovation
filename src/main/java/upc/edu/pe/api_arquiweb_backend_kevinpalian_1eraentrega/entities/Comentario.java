package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;

    @Column(name = "textComentario",length = 100,nullable = false)
    private String textComentario;

    //@ManyToOne
    //@JoinColumn(name = "idUser")
    //private User user;

    public Comentario() {
    }

    public Comentario(int idComentario, String textComentario) {
        this.idComentario = idComentario;
        this.textComentario = textComentario;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getTextComentario() {
        return textComentario;
    }

    public void setTextComentario(String textComentario) {
        this.textComentario = textComentario;
    }
}
