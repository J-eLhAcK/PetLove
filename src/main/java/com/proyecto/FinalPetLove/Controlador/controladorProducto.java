package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Producto;
import com.proyecto.FinalPetLove.Servicio.servicioProducto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorProducto {
    //Para instanciar la clase


    private servicioProducto servicio;

    public controladorProducto(servicioProducto servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarProducto")
    public ArrayList<Producto> listarMasc() {
        return servicio.listarProducto();
    }


    //Crear el metodo de conntrolador para buscar Producto

    @GetMapping("/buscarProducto/{id}")
    public Producto buscarProducto(@PathVariable("id") String id) {
        return servicio.buscarProducto(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarProducto/{idUsuario}/{idInventario}")
    public String agregarProducto(@PathVariable("idUsuario") String idUsuario, @PathVariable("idInventario") String idInventario, @RequestBody Producto producto) {
        return servicio.agregarProducto(idUsuario, idInventario, producto);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarProducto")
    public String actualizarProducto(@RequestBody Producto Producto){
        return servicio.actualizarProducto(Producto);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarProducto/{id}")
    public String eliminarProducto(@PathVariable("id")String id){
        return  servicio.eliminarProducto(id);
    }
}
