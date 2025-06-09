package com.Software2.Package.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "personal")
public class Personal {

    @Id
    private long idp;

    private long cedula;

    private String nombre;

    private String direccion;

    private String telefono;

    @ManyToOne
    @JoinColumn(name = "id_OrdenFK")
    private Orden orden;

    public Personal() {
    }

    public Personal(long idp) {
        this.idp = idp;
    }

    public Personal(long idp, long cedula, String nombre, String direccion, String telefono, Orden orden) {
        this.idp = idp;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.orden = orden;
    }

    public long getIdp() {
        return idp;
    }

    public void setIdp(long idp) {
        this.idp = idp;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

   
}
