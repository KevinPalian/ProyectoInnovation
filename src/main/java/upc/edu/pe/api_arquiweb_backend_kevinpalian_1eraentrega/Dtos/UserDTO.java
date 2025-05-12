package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Roles;

import java.util.List;
@Getter
@Setter
public class UserDTO {
    private int idUser;
    private String lastnameUser;
    private String emailUser;
    private Boolean belong_institutionUser;
    private int institution_codeUser;
    private String genderUser;
    private int ageUser;
    private String phoneUser;
    private String username;
    private String password;
    private Boolean enabled;
    private List<Roles> roles;

}
