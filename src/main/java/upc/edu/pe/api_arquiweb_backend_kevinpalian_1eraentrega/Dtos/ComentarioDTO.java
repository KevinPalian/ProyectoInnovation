package pe.edu.upc.demo3157api.dtos;

//import pe.edu.upc.demo3157api.entities.User

public class ComentarioDTO {
    private int idComentario;
    private String textComentario;
    //private User user;

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
