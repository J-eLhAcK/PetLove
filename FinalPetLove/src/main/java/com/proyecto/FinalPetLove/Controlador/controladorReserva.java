package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Reserva;
import com.proyecto.FinalPetLove.Servicio.servicioReserva;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorReserva {
    //Para instanciar la clase


    private servicioReserva servicio;

    public controladorReserva(servicioReserva servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarReserva")
    public ArrayList<Reserva> listarMasc() {
        return servicio.listarReserva();
    }


    //Crear el metodo de conntrolador para buscar Reserva

    @GetMapping("/buscarReserva/{id}")
    public Reserva buscarReserva(@PathVariable("id") String id) {
        return servicio.buscarReserva(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarReserva")
    public String agregarReserva(@RequestBody Reserva Reservas) {
        return servicio.agregarReserva(Reservas);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarReserva")
    public String actualizarReserva(@RequestBody Reserva Reserva){
        return servicio.actualizarReserva(Reserva);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarReserva/{id}")
    public String eliminarReserva(@PathVariable("id")String id){
        return  servicio.eliminarReserva(id);
    }
}
