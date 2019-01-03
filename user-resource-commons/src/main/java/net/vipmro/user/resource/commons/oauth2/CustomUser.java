package net.vipmro.user.resource.commons.oauth2;

import net.vipmro.user.resource.commons.result.Client;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author: liuHua
 * @create: 2018-11-27 11:28
 **/

public class CustomUser extends User {
	public CustomUser(String username, String password,Client client, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		this.client = client;
	}
	
	private Client client;
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
}
