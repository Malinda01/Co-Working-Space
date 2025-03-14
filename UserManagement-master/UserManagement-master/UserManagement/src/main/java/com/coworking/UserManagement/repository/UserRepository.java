package com.coworking.UserManagement.repository;

import com.coworking.UserManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Removing the login-related method
    Optional<User> findByEmailAndPassword(String email, String password);
}
