package pe.edu.upc.demo3157api.dtos;

//import pe.edu.upc.demo3157api.entities.User;

public class ComentaryDTO {
    private int idComentary;
    private String textComentary;
    //private User user;

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
