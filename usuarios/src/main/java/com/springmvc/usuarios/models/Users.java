package com.springmvc.usuarios.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;
    private String password;
    private String mail;
    private boolean status;
    private String completeName;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
