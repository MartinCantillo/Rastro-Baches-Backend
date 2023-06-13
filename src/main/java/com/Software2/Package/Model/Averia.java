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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "averia")
public class Averia {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idA;

    private String TipoDano;

    private String Costo;

    @ManyToOne
    @JoinColumn(name = "id_funcionarioFK")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_bacheFK")
    private Bache bache;

}
