package com.tripplanner.backend.repository;

import com.tripplanner.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Return Optional for safer null handling
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
