package com.Software2.Package.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    private long idF;

    private long cedulaF;

    private String nombreF;

    private String telefonoF;

    @ManyToOne
    @JoinColumn(name = "id_usuarioFK")
    private User user;

    public Funcionario() {
    }

    public Funcionario(long idF, long cedulaF, String nombreF, String telefonoF, User user) {
        this.idF = idF;
        this.cedulaF = cedulaF;
        this.nombreF = nombreF;
        this.telefonoF = telefonoF;
        this.user = user;
    }

    public Funcionario(long idF) {
        this.idF = idF;
    }

    public long getIdF() {
        return idF;
    }

    public void setIdF(long idF) {
        this.idF = idF;
    }

    public long getCedulaF() {
        return cedulaF;
    }

    public void setCedulaF(long cedulaF) {
        this.cedulaF = cedulaF;
    }

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public String getTelefonoF() {
        return telefonoF;
    }

    public void setTelefonoF(String telefonoF) {
        this.telefonoF = telefonoF;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

  
}
