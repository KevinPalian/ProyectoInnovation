package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.Dtos;

import lombok.*;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;

@Getter
@Setter
public class RolesDTO {
    private Long id;

    private String rol;

    private User user;
}
