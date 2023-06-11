/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ciudadano")
public class Ciudadano {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idC;

    private long cedulaC;

    private String nombreC;

    private String direccionC;
    private String telefonoC;

    @ManyToOne
    @JoinColumn(name = "id_usuarioFK")
    private User user;

    public Ciudadano(long idC) {
        this.idC = idC;
    }

}
