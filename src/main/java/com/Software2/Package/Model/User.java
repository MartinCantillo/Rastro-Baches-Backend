package com.Software2.Package.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username", unique = true)
    private String username;

    private String password;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    //@JsonBackReference
    private Rol rol;

    public User() {
    }

    public User(long id) {
        this.id = id;
    }

    public User(String username) {
        this.username = username;
    }

    public User(long id, String username, String password, Rol rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }


}
