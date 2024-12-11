package com.example.userapplicationspringboot.model;


import jakarta.persistence.*;

@Entity
@Table(name = "t_user")
public class User {


    private Long id;
    private String username;

    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(unique = true, nullable = false,name = "c_userName")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
