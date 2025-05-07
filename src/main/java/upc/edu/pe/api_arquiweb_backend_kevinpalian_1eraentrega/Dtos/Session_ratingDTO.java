package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Session;

import java.time.LocalDate;

public class Session_ratingDTO {
    private int IdSessionRating;
    private int ScoreSessionRating;
    private String comentSessionRating;
    private LocalDate DateSessionrating;
    private Session session;

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
