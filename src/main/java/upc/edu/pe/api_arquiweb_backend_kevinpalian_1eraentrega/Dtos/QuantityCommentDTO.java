package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

public class QuantityCommentDTO {

    private int idUser;
    private String nameUser;
    private String lastnameUser;
    private int institution_codeUser;
    private int quantityComment;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastnameUser() {
        return lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
    }

    public int getInstitution_codeUser() {
        return institution_codeUser;
    }

    public void setInstitution_codeUser(int institution_codeUser) {
        this.institution_codeUser = institution_codeUser;
    }

    public int getQuantityComment() {
        return quantityComment;
    }

    public void setQuantityComment(int quantityComment) {
        this.quantityComment = quantityComment;
    }
}
