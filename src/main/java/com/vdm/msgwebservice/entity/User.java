package com.vdm.msgwebservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column
    private String email;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;
    @Column(name = "company")
    private String company;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();

}
