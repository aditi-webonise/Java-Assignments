package com.spring.security;

import com.spring.security.entity.Role;
import com.spring.security.entity.User;
import com.spring.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class SecurityApplication{

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init(){
		User user = new User(
				"Aditi",
				"Mantri",
				"aditim@abc.com",
				passwordEncoder.encode("password"),
				Arrays.asList(
						new Role("ROLE_USER"),
						new Role("ROLE_ADMIN")));

		if (userRepository.findByEmail(user.getEmail()) == null){
			userRepository.save(user);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
