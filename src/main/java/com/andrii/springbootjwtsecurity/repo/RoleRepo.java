package com.andrii.springbootjwtsecurity.repo;

import com.andrii.springbootjwtsecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
