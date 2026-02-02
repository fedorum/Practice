package com.example.authenticatingldap;

import org.springframework.context.annotation.Configuration;

// importing the annotations for configuring the security chain required to enter the webpage
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

// importing the annotations for configuring the authentication processes of the security chain
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// this annotation defines the class as being a source of bean definitions (beans can be defined in this file)
@Configuration
public class WebSecurityConfig {

    // this annotation indicates that the method instantiates a new object that should be managed by the Spring inversion of control (IoC) container
    // the container is the core of the Spring Boot framework as it takes on the responsibility of creating objects
	@Bean
    // this component defines a sequence of security filters whenever a user tries to access the webpage
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // this block denotes that any request to the page must be fully authenticated via a user login
		http
			.authorizeHttpRequests((authorize) -> authorize
				.anyRequest().fullyAuthenticated()
			)
			.formLogin(Customizer.withDefaults());
        // this builds and returns the security filter chain to be employed during webpage access
		return http.build();
	}

    // this annotation tells Spring to find a matching Bean object to inject into the method
	@Autowired
    // this component is similar to the security filter chain, where a sequence of authentication methods can be configured
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
        // this block defines the search process to find the user's login details within the database
		auth
			.ldapAuthentication()
				.userDnPatterns("uid={0},ou=people")
				.groupSearchBase("ou=groups")
				.contextSource()
					.url("ldap://localhost:8389/dc=springframework,dc=org")
					.and()
				.passwordCompare()
					.passwordEncoder(new BCryptPasswordEncoder())
					.passwordAttribute("userPassword");
	}

}

//@Configuration
//public class WebSecurityConfig {

//	@Bean
//	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//		return http
//			.authorizeRequests()
//			.anyRequest().authenticated()
//			.and()
//			.formLogin(Customizer.withDefaults())
//			.build();
//	}
//}
