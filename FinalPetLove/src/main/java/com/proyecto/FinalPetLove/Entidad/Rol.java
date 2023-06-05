package com.proyecto.FinalPetLove.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @Column(unique = true, length = 30)
    private String id_rol;

    @Column(nullable = false, length = 30)
    private String nombre_rol;

    @Column(nullable = false, length = 30)
    private String descripcion_rol;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JsonIgnore
    private Set<Rol_Usuario> rol_usuario;


    public Rol(String id_rol, String nombre_rol, String descripcion_rol, Set<Rol_Usuario> rol_usuario) {
        this.id_rol = id_rol;
        this.nombre_rol = nombre_rol;
        this.descripcion_rol = descripcion_rol;
        this.rol_usuario = rol_usuario;
    }

    public Rol() {
    }

    public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public String getDescripcion_rol() {
        return descripcion_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }

    public Set<Rol_Usuario> getRol_usuario() {
        return rol_usuario;
    }

    public void setRol_usuario(Set<Rol_Usuario> rol_usuario) {
        this.rol_usuario = rol_usuario;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "id_rol='" + id_rol + '\'' +
                ", nombre_rol='" + nombre_rol + '\'' +
                ", descripcion_rol='" + descripcion_rol + '\'' +
                ", rol_usuario=" + rol_usuario +
                '}';
    }
}
