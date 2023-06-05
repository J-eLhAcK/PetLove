package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Producto_Reserva;
import com.proyecto.FinalPetLove.Servicio.servicioProducto_Reserva;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorProducto_Reserva {
    //Para instanciar la clase


    private servicioProducto_Reserva servicio;

    public controladorProducto_Reserva(servicioProducto_Reserva servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarProducto_Reserva")
    public ArrayList<Producto_Reserva> listarProducto_Reserva() {
        return servicio.listarProducto_Reserva();
    }


    //Crear el metodo de conntrolador para buscar Rol

    @GetMapping("/buscarProducto_Reserva/{id}")
    public Producto_Reserva buscarProducto_Reserva(@PathVariable("id") String id) {
        return servicio.buscarProducto_Reserva(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarProducto_Reserva")
    public String agregarProducto_Reserva(@RequestBody Producto_Reserva Producto_Reserva) {
        return servicio.agregarProducto_Reserva(Producto_Reserva);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarProducto_Reserva")
    public String actualizarProducto_Reserva(@RequestBody Producto_Reserva Producto_Reserva){
        return servicio.actualizarProducto_Reserva(Producto_Reserva);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarProducto_Reserva/{id}")
    public String eliminarProducto_Reserva(@PathVariable("id")String id){
        return  servicio.eliminarProducto_Reserva(id);
    }
}
