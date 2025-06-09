package com.Software2.Package.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "averia")
public class Averia {

    @Id
    private long idA;

    private String tipoDano;

    private String costo;

    @ManyToOne
    @JoinColumn(name = "id_funcionarioFK")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_bacheFK")
    private Bache bache;

    public Averia() {
    }

    public Averia(long idA, String tipoDano, String costo, Funcionario funcionario, Bache bache) {
        this.idA = idA;
        this.tipoDano = tipoDano;
        this.costo = costo;
        this.funcionario = funcionario;
        this.bache = bache;
    }

    public long getIdA() {
        return idA;
    }

    public void setIdA(long idA) {
        this.idA = idA;
    }

    public String getTipoDano() {
        return tipoDano;
    }

    public void setTipoDano(String tipoDano) {
        this.tipoDano = tipoDano;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Bache getBache() {
        return bache;
    }

    public void setBache(Bache bache) {
        this.bache = bache;
    }

  
}
