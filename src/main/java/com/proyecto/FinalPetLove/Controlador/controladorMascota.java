package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Mascota;
import com.proyecto.FinalPetLove.Servicio.servicioMascota;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorMascota {
    //Para instanciar la clase


    private servicioMascota servicio;

    public controladorMascota(servicioMascota servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarMascota")
    public ArrayList<Mascota> listarMasc() {
        return servicio.listarMascota();
    }


    //Crear el metodo de conntrolador para buscar Mascota

    @GetMapping("/buscarMascota/{id}")
    public Mascota buscarMascota(@PathVariable("id") String id) {
        return servicio.buscarMascota(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarMascota")
    public String agregarMascota(@RequestBody Mascota Mascotas) {
        return servicio.agregarMascota(Mascotas);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarMascota")
    public String actualizarMascota(@RequestBody Mascota Mascota){
        return servicio.actualizarMascota(Mascota);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarMascota/{id}")
    public String eliminarMascota(@PathVariable("id")String id){
        return  servicio.eliminarMascota(id);
    }
}
