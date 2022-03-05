package com.andrii.springbootjwtsecurity.repo;

import com.andrii.springbootjwtsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
