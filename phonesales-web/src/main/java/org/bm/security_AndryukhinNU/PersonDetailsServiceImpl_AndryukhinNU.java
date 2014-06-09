package org.bm.security_AndryukhinNU;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

import org.bm.ui_AndryukhinNU.PersonBean_AndryukhinNU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PersonDetailsServiceImpl_AndryukhinNU implements UserDetailsService {
	@Autowired
	PersonBean_AndryukhinNU pb;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				
		org.bm.service.person.PersonAndryukhinNU p = null;
		Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
		
		try {
			p = pb.get(username);
			if (p.isIsAdmin())
				auths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return new PersonDetails_YaromaAO(username, p.getPassword(), p.getSalt(), auths);
		
	}	
}