package com.andrii.springbootjwtsecurity.service;

import com.andrii.springbootjwtsecurity.domain.Role;
import com.andrii.springbootjwtsecurity.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User> getUsers();
}
