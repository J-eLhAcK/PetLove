package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Rol_Usuario;
import com.proyecto.FinalPetLove.Servicio.servicioRol_Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorRol_Usuario {
    //Para instanciar la clase


    private servicioRol_Usuario servicio;

    public controladorRol_Usuario(servicioRol_Usuario servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarRol_Usuario")
    public ArrayList<Rol_Usuario> listarRol_Usuario() {
        return servicio.listarRol_Usuario();
    }


    //Crear el metodo de conntrolador para buscar Rol

    @GetMapping("/buscarRol_Usuario/{id}")
    public Rol_Usuario buscarRol_Usuario(@PathVariable("id") String id) {
        return servicio.buscarRol_Usuario(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarRol_Usuario")
    public String agregarRol_Usuario(@RequestBody Rol_Usuario Rol_Usuario) {
        return servicio.agregarRol_Usuario(Rol_Usuario);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarRol_Usuario")
    public String actualizarRol_Usuario(@RequestBody Rol_Usuario Rol_Usuario){
        return servicio.actualizarRol_Usuario(Rol_Usuario);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarRol_Usuario/{id}")
    public String eliminarRol_Usuario(@PathVariable("id")String id){
        return  servicio.eliminarRol_Usuario(id);
    }
}
