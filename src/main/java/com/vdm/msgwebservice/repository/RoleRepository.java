package com.vdm.msgwebservice.repository;

import com.vdm.msgwebservice.entity.Role;
import com.vdm.msgwebservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
