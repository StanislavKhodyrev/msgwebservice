package com.vdm.msgwebservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name = "organizations")
public class Organizations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "orgname")
    private String orgname;

//    @OneToMany(targetEntity=User.class, mappedBy="organizations",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<User> usersList;
}
