package com.proyecto.FinalPetLove.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "rol_usuario")
public class Rol_Usuario {

    @Id
    @Column(unique = true, length = 30)
    private String id_rol_usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false)
    @JsonIgnore
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", nullable = false)
    @JsonIgnore
    private Rol rol;

    public Rol_Usuario(String id_rol_usuario, Usuario usuario, Rol rol) {
        this.id_rol_usuario = id_rol_usuario;
        this.usuario = usuario;
        this.rol = rol;
    }

    public Rol_Usuario() {
    }

    public String getId_rol_usuario() {
        return id_rol_usuario;
    }

    public void setId_rol_usuario(String id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Rol_Usuario{" +
                "id_rol_usuario='" + id_rol_usuario + '\'' +
                ", usuario=" + usuario +
                ", rol=" + rol +
                '}';
    }
}
