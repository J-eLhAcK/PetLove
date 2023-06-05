package com.proyecto.FinalPetLove.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(unique = true, length = 30)
    private String id_usuario;

    @Column(nullable = false,length = 50)
    private String nombre_usuario;

    @Column(nullable = false,length = 50)
    private String apellido_usuario;

    @Column(nullable = false,length = 50)
    private String telefono_usuario;

    @Column(nullable = false,length = 50)
    private String direccion_usuario;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JsonIgnore
    private Set<Rol_Usuario> usuario;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JsonIgnore
    private Set<Mascota> mascota;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JsonIgnore
    private Set<Producto> producto;

    public Usuario(String id_usuario, String nombre_usuario, String apellido_usuario, String telefono_usuario, String direccion_usuario, Set<Rol_Usuario> usuario, Set<Mascota> mascota, Set<Producto> producto) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.telefono_usuario = telefono_usuario;
        this.direccion_usuario = direccion_usuario;
        this.usuario = usuario;
        this.mascota = mascota;
        this.producto = producto;
    }

    public Usuario() {
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public String getDireccion_usuario() {
        return direccion_usuario;
    }

    public void setDireccion_usuario(String direccion_usuario) {
        this.direccion_usuario = direccion_usuario;
    }

    public Set<Rol_Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Set<Rol_Usuario> usuario) {
        this.usuario = usuario;
    }

    public Set<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(Set<Mascota> mascota) {
        this.mascota = mascota;
    }

    public Set<Producto> getProducto() {
        return producto;
    }

    public void setProducto(Set<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario='" + id_usuario + '\'' +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", apellido_usuario='" + apellido_usuario + '\'' +
                ", telefono_usuario='" + telefono_usuario + '\'' +
                ", direccion_usuario='" + direccion_usuario + '\'' +
                ", usuario=" + usuario +
                ", mascota=" + mascota +
                ", producto=" + producto +
                '}';
    }
}

