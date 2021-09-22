//package com.vdm.msgwebservice.security;
//
//import com.vdm.msgwebservice.entity.User;
//import lombok.Data;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import java.util.Collection;
//import java.util.List;
//
//@Data
//public class SecurityUser implements UserDetails {
//    private final Long id;
//    private final String username;
//    private final String password;
//    private final String email;
//    private final List<SimpleGrantedAuthority> authorities;
//    private final boolean isActive;
//
//    public SecurityUser(Long id, String username, String password, String email, List<SimpleGrantedAuthority> authorities, boolean isActive) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.authorities = authorities;
//        this.isActive = isActive;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return isActive;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return isActive;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return isActive;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return isActive;
//    }
//
//}
