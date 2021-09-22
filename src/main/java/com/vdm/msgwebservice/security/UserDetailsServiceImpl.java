//package com.vdm.msgwebservice.security;
//
//import com.vdm.msgwebservice.entity.User;
//import com.vdm.msgwebservice.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service("userDetailsServiceImpl")
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private final UserService userService;
//    @Autowired
//    public UserDetailsServiceImpl(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userService.findByUsername(username);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User with username: " + username + " not found");
//        }
//
//        SecurityUser securityUser = SecurityUserFactory.create(user);
//        return securityUser;
//    }
//}
