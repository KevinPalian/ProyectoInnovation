package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Comentary")
public class Comentary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentary;

    @Column(name = "textComentary",length = 100,nullable = false)
    private String textComentary;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    public Comentary() {
    }

    public int getIdComentary() {
        return idComentary;
    }

    public void setIdComentary(int idComentary) {
        this.idComentary = idComentary;
    }

    public String getTextComentary() {
        return textComentary;
    }

    public void setTextComentary(String textComentary) {
        this.textComentary = textComentary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
