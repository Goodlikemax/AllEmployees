package com.goodlikemax.AllEmployees.repo;

import com.goodlikemax.AllEmployees.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * "Created by : goodlikemax"
 * "Date: "13.02.2022
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
