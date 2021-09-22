//package com.vdm.msgwebservice.service;
//
//import com.vdm.msgwebservice.entity.Role;
//import com.vdm.msgwebservice.entity.Status;
//import com.vdm.msgwebservice.entity.User;
//import com.vdm.msgwebservice.repository.RoleRepository;
//import com.vdm.msgwebservice.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//    private UserRepository userRepository;
//    private RoleRepository roleRepository;
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public User register(User user) {
//        Role roleUser = roleRepository.findByName("ROLE_USER");
//        List<Role> userRoles = new ArrayList<>();
//        userRoles.add(roleUser);
//
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        user.setRoles(userRoles);
//        user.setStatus(Status.ACTIVE);
//
//        System.out.println("USER from register = " + user.toString());
//
//        User registeredUser = userRepository.save(user);
//        return registeredUser;
//    }
//
//    @Override
//    public List<User> getAll() {
//        List<User> result = userRepository.findAll();
//        return result;
//    }
//
//    @Override
//    public User findByUsername(String username) {
//        User result = userRepository.findByUsername(username);
//        return result;
//    }
//
//    @Override
//    public User findById(Long id) {
//        User result = userRepository.findById(id).orElse(null);
//        return result;
//    }
//
//    @Override
//    public void delete(Long id) {
//        userRepository.deleteById(id);
//    }
//}
