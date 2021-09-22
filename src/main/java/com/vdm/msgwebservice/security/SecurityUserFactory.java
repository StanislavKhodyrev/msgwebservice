//package com.vdm.msgwebservice.security;
//
//import com.vdm.msgwebservice.entity.Role;
//import com.vdm.msgwebservice.entity.Status;
//import com.vdm.msgwebservice.entity.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public final class SecurityUserFactory {
//
//    public SecurityUserFactory() {
//    }
//
//    public static SecurityUser create(User user) {
//        return new SecurityUser(
//                user.getId(),
//                user.getUsername(),
//                user.getPassword(),
//                user.getEmail(),
//                null,
//                user.getStatus().equals(Status.ACTIVE)
//        );
//    }
//
//    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> userRole) {
//        return userRole.stream()
//                .map(role -> new SimpleGrantedAuthority(role.getName()))
//                .collect(Collectors.toList());
//    }
//}
