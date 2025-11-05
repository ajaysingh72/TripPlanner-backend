package com.tripplanner.backend.service;

import com.tripplanner.backend.model.User;
import com.tripplanner.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Fetch user by email safely
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Fetch user by username safely
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Save a new user (useful for registration)
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Check if email already exists
    public boolean emailExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    // Check if username already exists
    public boolean usernameExists(String username) {
        return userRepository.findByUsername(username).isPresent();
    }
}
