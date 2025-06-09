package com.Software2.Package.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {

    @Id
    private long idC;

    private long cedulaC;

    private String nombreC;

    private String direccionC;

    private String telefonoC;

    @ManyToOne
    @JoinColumn(name = "id_usuarioFK")
    private User user;

    public Ciudadano() {
    }

    public Ciudadano(long idC, long cedulaC, String nombreC, String direccionC, String telefonoC, User user) {
        this.idC = idC;
        this.cedulaC = cedulaC;
        this.nombreC = nombreC;
        this.direccionC = direccionC;
        this.telefonoC = telefonoC;
        this.user = user;
    }

    public Ciudadano(long idC) {
        this.idC = idC;
    }

    public long getIdC() {
        return idC;
    }

    public void setIdC(long idC) {
        this.idC = idC;
    }

    public long getCedulaC() {
        return cedulaC;
    }

    public void setCedulaC(long cedulaC) {
        this.cedulaC = cedulaC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public String getTelefonoC() {
        return telefonoC;
    }

    public void setTelefonoC(String telefonoC) {
        this.telefonoC = telefonoC;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ciudadano{" +
                "idC=" + idC +
                ", cedulaC=" + cedulaC +
                ", nombreC='" + nombreC + '\'' +
                ", direccionC='" + direccionC + '\'' +
                ", telefonoC='" + telefonoC + '\'' +
                ", user=" + user +
                '}';
    }

 
}
