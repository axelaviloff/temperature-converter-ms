package br.com.userms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.userms.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	
}
