package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Inventario;
import com.proyecto.FinalPetLove.Servicio.servicioInventario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorInventario {
    //Para instanciar la clase


    private servicioInventario servicio;

    public controladorInventario(servicioInventario servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarInventario")
    public ArrayList<Inventario> listarMasc() {
        return servicio.listarInventario();
    }


    //Crear el metodo de conntrolador para buscar Inventario

    @GetMapping("/buscarInventario/{id}")
    public Inventario buscarInventario(@PathVariable("id") String id) {
        return servicio.buscarInventario(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarInventario")
    public String agregarInventario(@RequestBody Inventario Inventarios) {
        return servicio.agregarInventario(Inventarios);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarInventario")
    public String actualizarInventario(@RequestBody Inventario Inventario){
        return servicio.actualizarInventario(Inventario);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarInventario/{id}")
    public String eliminarInventario(@PathVariable("id")String id){
        return  servicio.eliminarInventario(id);
    }
}
