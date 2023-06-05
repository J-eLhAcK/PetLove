package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Servicio_Reserva;
import com.proyecto.FinalPetLove.Servicio.servicioServicio_Reserva;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorServicio_Reserva {
    //Para instanciar la clase


    private servicioServicio_Reserva servicio;

    public controladorServicio_Reserva(servicioServicio_Reserva servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarServicio_Reserva")
    public ArrayList<Servicio_Reserva> listarServicio_Reserva() {
        return servicio.listarServicio_Reserva();
    }


    //Crear el metodo de conntrolador para buscar Rol

    @GetMapping("/buscarServicio_Reserva/{id}")
    public Servicio_Reserva buscarServicio_Reserva(@PathVariable("id") String id) {
        return servicio.buscarServicio_Reserva(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarServicio_Reserva")
    public String agregarServicio_Reserva(@RequestBody Servicio_Reserva Servicio_Reserva) {
        return servicio.agregarServicio_Reserva(Servicio_Reserva);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarServicio_Reserva")
    public String actualizarServicio_Reserva(@RequestBody Servicio_Reserva Servicio_Reserva){
        return servicio.actualizarServicio_Reserva(Servicio_Reserva);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarServicio_Reserva/{id}")
    public String eliminarServicio_Reserva(@PathVariable("id")String id){
        return  servicio.eliminarServicio_Reserva(id);
    }
}
