package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.User;
import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.repositories.IUserRepository;

import java.util.ArrayList;
import java.util.List;


//Clase 2
@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserRepository repo;


    @Override
    public UserDetails loadUserByUsername(String nameUser) throws UsernameNotFoundException {
        User user = repo.findOneByNameUser(nameUser);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", nameUser));
        }
        List<GrantedAuthority> roles = new ArrayList<>();

        user.getRoles().forEach(role -> {
            roles.add(new SimpleGrantedAuthority(role.getNameRole()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getNameUser(),user.getPasswordUser(), user.getEnabled(), true, true, true, roles);
        return ud;
    }
}