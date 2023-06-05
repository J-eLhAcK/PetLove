package com.proyecto.FinalPetLove.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "servicio_reserva")
public class Servicio_Reserva {
    @Id
    @Column(unique = true, length = 30)
    private String id_servicio_reserva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva", nullable = false)
    @JsonIgnore
    private Reserva reserva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio", nullable = false)
    @JsonIgnore
    private Servicio servicio;

    public Servicio_Reserva(String id_servicio_reserva, Reserva reserva, Servicio servicio) {
        this.id_servicio_reserva = id_servicio_reserva;
        this.reserva = reserva;
        this.servicio = servicio;
    }

    public Servicio_Reserva() {
    }

    public String getId_servicio_reserva() {
        return id_servicio_reserva;
    }

    public void setId_servicio_reserva(String id_servicio_reserva) {
        this.id_servicio_reserva = id_servicio_reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Servicio_Reserva{" +
                "id_servicio_reserva='" + id_servicio_reserva + '\'' +
                ", reserva=" + reserva +
                ", servicio=" + servicio +
                '}';
    }
}
