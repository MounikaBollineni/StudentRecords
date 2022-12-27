package com.projects.StudentRecords.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.http.HttpMethod.*;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration{

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests((auth)->auth.anyRequest().authenticated()).httpBasic((Customizer.withDefaults()));
////        http.cors().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception{
//        builder.inMemoryAuthentication().withUser("Mounika").password(passwordEncoder().encode("Mounika@97"));
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder(8);
//    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails userDetails=User.withUsername("mounika")
                .password("{noop}Mounika@97").roles("USER").build();
        return new InMemoryUserDetailsManager(userDetails);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.csrf().disable();
        http.authorizeRequests().
                anyRequest().fullyAuthenticated().and().httpBasic();
        return http.build();
    }
}
