/**
 * 
 */
package org.bm.security_AndryukhinNU;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * @author Black Moon
 *
 */
public class PersonDetails_YaromaAO extends User {

	private static final long serialVersionUID = 1L;
	
	private String salt;
	
	public PersonDetails_YaromaAO(String username, String password, String salt, Collection<? extends GrantedAuthority> authorities){
		super(username, password, authorities);
			
		this.setSalt(salt); 
	}


	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}
