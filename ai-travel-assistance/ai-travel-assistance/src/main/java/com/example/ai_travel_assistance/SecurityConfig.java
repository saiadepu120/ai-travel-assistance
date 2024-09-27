package com.example.ai_travel_assistance;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .anyRequest().authenticated()
                )
                .formLogin(login -> login
                        .loginPage("/login")    // Specifies the custom login page
                        .permitAll()            // Allows anyone to access the login page
                );

        return http.build();
    }
}
