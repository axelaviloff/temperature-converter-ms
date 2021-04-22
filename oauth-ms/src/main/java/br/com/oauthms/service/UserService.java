package br.com.oauthms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.oauthms.feignclients.UserFeignClient;
import br.com.oauthms.model.User;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if (user == null) {
			
			throw new IllegalArgumentException("Email not found");
		}
		System.out.println("Email found: " + email);
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userFeignClient.findByEmail(username).getBody();
		if (user == null) {
			
			throw new UsernameNotFoundException("Email not found");
		}
		System.out.println("Email found: " + username);
		return user;
	}
}
