package com.vdm.msgwebservice.repository;

import com.vdm.msgwebservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByUsernameAndEmail(String username, String email);

    boolean existsByEmailAndUsername(String email, String username);
}
