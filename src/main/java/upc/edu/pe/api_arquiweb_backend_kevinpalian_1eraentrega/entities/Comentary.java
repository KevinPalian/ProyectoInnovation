package pe.edu.upc.demo3157api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comentary")
public class Comentary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentary;

    @Column(name = "textComentary",length = 100,nullable = false)
    private String textComentary;

    //@OneToMany <- No funciona XD
    //@JoinColumn(name = "idUser")
    //private User user;

    public Comentary() {
    }

    public Comentary(int idComentary, String textComentary, User user) {
        this.idComentary = idComentary;
        this.textComentary = textComentary;
        //this.user = new User();
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

    //public User getUser() {
    //    return user;
    //}

    //public void setUser(User user) {
    //    this.user = user;
    //}
}
