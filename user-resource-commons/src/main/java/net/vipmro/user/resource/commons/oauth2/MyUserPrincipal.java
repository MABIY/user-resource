package net.vipmro.user.resource.commons.oauth2;

import net.vipmro.user.resource.commons.result.Client;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Principal;
import java.util.Collection;

public class MyUserPrincipal implements UserDetails,Principal{
    private CustomUser user;
    
    public MyUserPrincipal(CustomUser user) {
        this.user = user;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthorities();
    }
    
    @Override
    public String getPassword() {
        return user.getPassword();
    }
    
    @Override
    public String getUsername() {
        return user.getUsername();
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    @Override
    public boolean isEnabled() {
        return true;
    }
    
    @Override
    public String getName() {
        return user.getUsername();
    }
    
    public Client getClient() {
        return user.getClient();
    }
}