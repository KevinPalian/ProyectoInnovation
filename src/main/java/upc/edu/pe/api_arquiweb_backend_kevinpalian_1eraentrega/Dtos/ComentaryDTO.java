package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

public class ComentaryDTO {
    private int idComentary;
    private String textComentary;
    private User user;

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
