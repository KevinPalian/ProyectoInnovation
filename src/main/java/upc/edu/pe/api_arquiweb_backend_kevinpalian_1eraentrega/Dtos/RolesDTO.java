package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

public class RolesDTO {
    private int idRoles;
    private String nameRole;
    private User user;

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
