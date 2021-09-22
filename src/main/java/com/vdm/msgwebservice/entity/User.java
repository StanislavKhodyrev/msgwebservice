package com.vdm.msgwebservice.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

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

}
