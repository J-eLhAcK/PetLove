package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Servicio;
import com.proyecto.FinalPetLove.Servicio.servicioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorServicio {
    //Para instanciar la clase


    private servicioServicio servicio;

    public controladorServicio(servicioServicio servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarServicio")
    public ArrayList<Servicio> listarMasc() {
        return servicio.listarServicio();
    }


    //Crear el metodo de conntrolador para buscar Servicio

    @GetMapping("/buscarServicio/{id}")
    public Servicio buscarServicio(@PathVariable("id") String id) {
        return servicio.buscarServicio(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarServicio")
    public String agregarServicio(@RequestBody Servicio Servicios) {
        return servicio.agregarServicio(Servicios);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarServicio")
    public String actualizarServicio(@RequestBody Servicio Servicio){
        return servicio.actualizarServicio(Servicio);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarServicio/{id}")
    public String eliminarServicio(@PathVariable("id")String id){
        return  servicio.eliminarServicio(id);
    }
}
