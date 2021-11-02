package com.vdm.msgwebservice.service;

import com.vdm.msgwebservice.entity.Role;
import com.vdm.msgwebservice.entity.User;

import java.util.List;

public interface UserService {

    User register(User user);

    Role saveRole(Role role);

    void addRoleToUser(User user, String role);

    List<User> getAll();

    User findByUsername(String username);

    User findByUsernameAndEmail(String username, String email);

    User findById(Long id);

    void delete(Long id);

    boolean existsByEmailAndUsername(String email, String username);


}
