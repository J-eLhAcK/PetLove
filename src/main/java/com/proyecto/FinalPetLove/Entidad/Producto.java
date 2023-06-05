package com.proyecto.FinalPetLove.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @Column(unique = true, length = 30)
    private String id_producto;

    @Column(nullable = false, length = 30)
    private String nombre_producto;

    @Column(nullable = false, length = 50)
    private String descripcion_producto;

    @Column(nullable = false, length = 30)
    private int precio_producto;

    @Column(nullable = false, length = 30)
    private int stock_producto;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JsonIgnore
    private Set<Producto_Reserva> producto_reserva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false)
    @JsonIgnore
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_inventario", referencedColumnName = "id_inventario", nullable = false)
    @JsonIgnore
    private Inventario inventario;

    public Producto(String id_producto, String nombre_producto, String descripcion_producto, int precio_producto, int stock_producto, Set<Producto_Reserva> producto_reserva, Usuario usuario, Inventario inventario) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.precio_producto = precio_producto;
        this.stock_producto = stock_producto;
        this.producto_reserva = producto_reserva;
        this.usuario = usuario;
        this.inventario = inventario;
    }

    public Producto() {
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(int precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }

    public Set<Producto_Reserva> getProducto_reserva() {
        return producto_reserva;
    }

    public void setProducto_reserva(Set<Producto_Reserva> producto_reserva) {
        this.producto_reserva = producto_reserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_producto='" + id_producto + '\'' +
                ", nombre_producto='" + nombre_producto + '\'' +
                ", descripcion_producto='" + descripcion_producto + '\'' +
                ", precio_producto=" + precio_producto +
                ", stock_producto=" + stock_producto +
                ", producto_reserva=" + producto_reserva +
                ", usuario=" + usuario +
                ", inventario=" + inventario +
                '}';
    }
}
