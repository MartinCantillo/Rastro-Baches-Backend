package com.Software2.Package.Model;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    @OneToMany(mappedBy = "rol")
    @JsonIgnore 
    private Set<User> users;

    public Rol() {
    }

    public Rol(long id) {
        this.id = id;
    }

    public Rol(long id, String nombre, Set<User> users) {
        this.id = id;
        this.nombre = nombre;
        this.users = users;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

}
