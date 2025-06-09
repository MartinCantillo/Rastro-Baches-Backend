package com.Software2.Package.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "bache")
public class Bache {

    @Id
    private long idB;

    private String direccionB;
    private String tamano;
    private String ubicacionB;
    private String distrito;
    private String urgencia;

    @ManyToOne
    @JoinColumn(name = "id_ciudadanoFK")
    private Ciudadano ciudadano;

    public Bache() {
    }

    public Bache(long idB, String direccionB, String tamano, String ubicacionB, String distrito, String urgencia, Ciudadano ciudadano) {
        this.idB = idB;
        this.direccionB = direccionB;
        this.tamano = tamano;
        this.ubicacionB = ubicacionB;
        this.distrito = distrito;
        this.urgencia = urgencia;
        this.ciudadano = ciudadano;
    }

    public Bache(long idB) {
        this.idB = idB;
    }

    public long getIdB() {
        return idB;
    }

    public void setIdB(long idB) {
        this.idB = idB;
    }

    public String getDireccionB() {
        return direccionB;
    }

    public void setDireccionB(String direccionB) {
        this.direccionB = direccionB;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getUbicacionB() {
        return ubicacionB;
    }

    public void setUbicacionB(String ubicacionB) {
        this.ubicacionB = ubicacionB;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

   
}
