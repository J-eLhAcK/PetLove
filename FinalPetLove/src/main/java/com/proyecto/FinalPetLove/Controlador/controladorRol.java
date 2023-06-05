package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Rol;
import com.proyecto.FinalPetLove.Servicio.servicioRol;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorRol {
    //Para instanciar la clase


    private servicioRol servicio;

    public controladorRol(servicioRol servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarRol")
    public ArrayList<Rol> listarRols() {
        return servicio.listarRol();
    }


    //Crear el metodo de conntrolador para buscar Rol

    @GetMapping("/buscarRol/{id}")
    public Rol buscarRol(@PathVariable("id") String id) {
        return servicio.buscarRol(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarRol")
    public String agregarRol(@RequestBody Rol Rol) {
        return servicio.agregarRol(Rol);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarRol")
    public String actualizarRol(@RequestBody Rol Rol){
        return servicio.actualizarRol(Rol);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarRol/{id}")
    public String eliminarRol(@PathVariable("id")String id){
        return  servicio.eliminarRol(id);
    }
}
