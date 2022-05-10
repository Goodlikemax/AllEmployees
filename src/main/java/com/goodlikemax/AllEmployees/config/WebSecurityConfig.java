package com.goodlikemax.AllEmployees.config;

import com.goodlikemax.AllEmployees.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.goodlikemax.AllEmployees.domain.Role.ADMIN;
import static com.goodlikemax.AllEmployees.domain.Role.USER;


/**
 * "Created by : goodlikemax"
 * "Date: "13.02.2022
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private UserService userService;


    private final PasswordEncoder passwordEncoder;

    public WebSecurityConfig(PasswordEncoder passwordEncoder, UserService userService) {
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/employees/**").hasAnyRole(ADMIN.name(), USER.name())
                .and()
                .authorizeRequests()
                .antMatchers("/**").hasRole(ADMIN.name())
                .and()
                .httpBasic();


//                .authorizeRequests()
//                .antMatchers("/").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
    }


    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails admin = User.builder()
                .username("a")
                .password(passwordEncoder.encode("a"))
                .roles(ADMIN.name())
                .build();

        UserDetails user = User.builder()
                .username("u")
                .password(passwordEncoder.encode("u"))
                .roles(USER.name())
                .build();



        return new InMemoryUserDetailsManager(
            admin, user
        );
    }
}
