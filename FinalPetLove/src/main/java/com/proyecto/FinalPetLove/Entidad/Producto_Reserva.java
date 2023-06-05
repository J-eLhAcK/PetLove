package com.proyecto.FinalPetLove.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "producto_reserva")
public class Producto_Reserva {
    @Id
    @Column(unique = true, length = 30)
    private String id_producto_reserva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva", nullable = false)
    @JsonIgnore
    private Reserva reserva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", nullable = false)
    @JsonIgnore
    private Producto producto;

    public Producto_Reserva(String id_producto_reserva, Reserva reserva, Producto producto) {
        this.id_producto_reserva = id_producto_reserva;
        this.reserva = reserva;
        this.producto = producto;
    }

    public Producto_Reserva() {
    }

    public String getId_producto_reserva() {
        return id_producto_reserva;
    }

    public void setId_producto_reserva(String id_producto_reserva) {
        this.id_producto_reserva = id_producto_reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Producto_Reserva{" +
                "id_producto_reserva='" + id_producto_reserva + '\'' +
                ", reserva=" + reserva +
                ", producto=" + producto +
                '}';
    }
}
