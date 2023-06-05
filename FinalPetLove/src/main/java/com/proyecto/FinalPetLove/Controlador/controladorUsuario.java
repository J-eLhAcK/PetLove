package com.proyecto.FinalPetLove.Controlador;

import com.proyecto.FinalPetLove.Entidad.Usuario;
import com.proyecto.FinalPetLove.Servicio.servicioUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class controladorUsuario {

    //Para instanciar la clase


    private servicioUsuario servicio;

    public controladorUsuario(servicioUsuario servicio) {
        this.servicio = servicio;
    }


    //Crear la ruta y retorna a un arraylist

    @GetMapping("/ListarUsuario")
    public ArrayList<Usuario> listarUsu() {
        return servicio.listarUsuario();
    }


    //Crear el metodo de conntrolador para buscar Usuario

    @GetMapping("/buscarUsuario/{id}")
    public Usuario buscarUsuario(@PathVariable("id") String id) {
        return servicio.buscarUsuario(id);

    }


    //Crear metodo de agregar
    @PostMapping("/agregarUsuario")
    public String agregarUsuario(@RequestBody Usuario Usuarios) {
        return servicio.agregarUsuario(Usuarios);
    }


    //Metodo para Actualizar con Put

    @PutMapping("/actualizarUsuario")
    public String actualizarUsuario(@RequestBody Usuario Usuario){
        return servicio.actualizarUsuario(Usuario);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarUsuario/{id}")
    public String eliminarUsuario(@PathVariable("id")String id){
        return  servicio.eliminarUsuario(id);
    }
}
