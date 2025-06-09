package com.Software2.Package.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "orden")
public class Orden {

    @Id
    private long idO;

    private long horas;

    private String estados;

    private String materiales;

    private String precio;

    @ManyToOne
    @JoinColumn(name = "id_funcionarioFK")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_BacheFK")
    private Bache bache;

    public Orden() {
    }

    public Orden(long idO) {
        this.idO = idO;
    }

    public Orden(long idO, long horas, String estados, String materiales, String precio, Funcionario funcionario, Bache bache) {
        this.idO = idO;
        this.horas = horas;
        this.estados = estados;
        this.materiales = materiales;
        this.precio = precio;
        this.funcionario = funcionario;
        this.bache = bache;
    }

    public long getIdO() {
        return idO;
    }

    public void setIdO(long idO) {
        this.idO = idO;
    }

    public long getHoras() {
        return horas;
    }

    public void setHoras(long horas) {
        this.horas = horas;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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
