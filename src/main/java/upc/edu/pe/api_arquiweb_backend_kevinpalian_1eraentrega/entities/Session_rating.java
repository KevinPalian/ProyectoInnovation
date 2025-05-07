package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Session_Rating")
public class Session_rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdSessionRating;

    @Column(name = "ScoreSessionRating", nullable = false)
    private int ScoreSessionRating;

    @Column(name = "comentSessionRating", nullable = false, length = 50)
    private String comentSessionRating;

    @Column(name = "DateSessionrating", nullable = false)
    private LocalDate DateSessionrating;

    @OneToOne
    @JoinColumn(name = "Idsession")
    private Session session;

    public Session_rating() {
    }

    public Session_rating(int idSessionRating, int scoreSessionRating, String comentSessionRating, LocalDate dateSessionrating, Session session) {
        IdSessionRating = idSessionRating;
        ScoreSessionRating = scoreSessionRating;
        this.comentSessionRating = comentSessionRating;
        DateSessionrating = dateSessionrating;
        this.session = session;
    }

    public int getIdSessionRating() {
        return IdSessionRating;
    }

    public void setIdSessionRating(int idSessionRating) {
        IdSessionRating = idSessionRating;
    }

    public int getScoreSessionRating() {
        return ScoreSessionRating;
    }

    public void setScoreSessionRating(int scoreSessionRating) {
        ScoreSessionRating = scoreSessionRating;
    }

    public String getComentSessionRating() {
        return comentSessionRating;
    }

    public void setComentSessionRating(String comentSessionRating) {
        this.comentSessionRating = comentSessionRating;
    }

    public LocalDate getDateSessionrating() {
        return DateSessionrating;
    }

    public void setDateSessionrating(LocalDate dateSessionrating) {
        DateSessionrating = dateSessionrating;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
