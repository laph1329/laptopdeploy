package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/laptop/all").permitAll()
                .antMatchers("/hola/bootstrap").hasRole("ADMIN")
                .anyRequest().authenticated()/*nos indica que todas las peticiones deben estar autenticadas*/
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }
}
