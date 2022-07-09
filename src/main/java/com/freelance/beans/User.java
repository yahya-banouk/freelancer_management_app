package com.freelance.beans;

import org.hibernate.validator.constraints.UniqueElements;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
public abstract class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotEmpty
    private String name;
    @NotEmpty
    @UniqueElements(message = "username already taken")
    private String username;
    @NotEmpty
    @UniqueElements(message = "email already in use")
    private String email;
    private String password;

    public User(int id, String name, String email, String password) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name,String username,  String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
