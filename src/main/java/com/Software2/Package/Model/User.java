/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "User")
@Entity
public class User {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "username", unique = true)
    private String username;

    private String password;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    public User(long id) {
        this.id = id;
    }
}
