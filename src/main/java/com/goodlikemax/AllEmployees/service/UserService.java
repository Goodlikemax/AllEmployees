package com.goodlikemax.AllEmployees.service;

import com.goodlikemax.AllEmployees.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * "Created by : goodlikemax"
 * "Date: "13.02.2022
 */
@Service
public class UserService  {
    @Autowired
    UserRepository userRepository;


//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userRepository.findByUsername(username);
//    }
}
