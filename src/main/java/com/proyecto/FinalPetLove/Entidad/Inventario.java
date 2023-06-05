package com.proyecto.FinalPetLove.Entidad;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id //Llave primaria
    @Column(unique = true, length = 30)
    private String id_inventario;

    @Column(name = "fecha_inventario")
    @Temporal(TemporalType.DATE)
    private Date fecha_inventario;

    @Column(nullable = false, length = 30)
    private int cantidad_inventario;

    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    private Set<Producto> producto;

    @PrePersist
    public void fechaActual(){
        this.fecha_inventario = new Date();
    }

    public Inventario(String id_inventario, Date fecha_inventario, int cantidad_inventario, Set<Producto> producto) {
        this.id_inventario = id_inventario;
        this.fecha_inventario = fecha_inventario;
        this.cantidad_inventario = cantidad_inventario;
        this.producto = producto;
    }

    public Inventario() {
    }

    public String getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(String id_inventario) {
        this.id_inventario = id_inventario;
    }

    public Date getFecha_inventario() {
        return fecha_inventario;
    }

    public void setFecha_inventario(Date fecha_inventario) {
        this.fecha_inventario = fecha_inventario;
    }

    public int getCantidad_inventario() {
        return cantidad_inventario;
    }

    public void setCantidad_inventario(int cantidad_inventario) {
        this.cantidad_inventario = cantidad_inventario;
    }

    public Set<Producto> getProducto() {
        return producto;
    }

    public void setProducto(Set<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id_inventario='" + id_inventario + '\'' +
                ", fecha_inventario=" + fecha_inventario +
                ", cantidad_inventario=" + cantidad_inventario +
                ", producto=" + producto +
                '}';
    }
}
