package com.sheridan.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
@EnableWebSecurity
public class SecurityConfig {
    @SuppressWarnings("deprecated")
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception {
        authentication.
                        inMemoryAuthentication()
                            .passwordEncoder(NoOpPasswordEncoder.getInstance())
                                .withUser("jatin").password("jatin711").roles("user");
    }
}
