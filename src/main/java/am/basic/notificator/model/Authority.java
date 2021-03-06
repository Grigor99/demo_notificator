package am.basic.notificator.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authority implements GrantedAuthority {


    private int id;

    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
