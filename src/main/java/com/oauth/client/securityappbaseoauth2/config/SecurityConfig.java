package com.oauth.client.securityappbaseoauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(request -> {
                    request.requestMatchers("/", "/hello").permitAll();
                    request.anyRequest().authenticated();
                })

                //Login por defecto de Spring
                .formLogin(Customizer.withDefaults())

                //Login de OAuth por defecto
                .oauth2Login(Customizer.withDefaults())
                .build();
    }


}
