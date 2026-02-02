package com.example.file_uploader_rep;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    // specifies that any user entering the application must be logged in and authenticated to use it
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // any user can access the "[host]/login" URL, while all other URLs requires the user to be authenticated
            .authorizeHttpRequests(authorizeRequests -> 
                authorizeRequests
                    .requestMatchers("/login*", "/css/**").permitAll()
                    .anyRequest().authenticated()
            )
            // specifies the login page for the application at the "[host]/login" URL for any user to access
            .formLogin(formLogin -> 
                formLogin
                    .loginPage("/login").permitAll()
            );
        
        return http.build();
    }
}
