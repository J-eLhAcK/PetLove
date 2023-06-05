package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Usuario;
import com.proyecto.FinalPetLove.Repositorio.repositorioUsuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioUsuario {
    
    private repositorioUsuario repositorio;

    public servicioUsuario(repositorioUsuario repositorio){
        this.repositorio=repositorio;
    }
    
    public ArrayList<Usuario> listarUsuario(){
        return (ArrayList<Usuario>) repositorio.findAll();
    }


    //Metodo de buscar Usuario por Jpa


    public Usuario buscarUsuario(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarUsuario(Usuario Usuario) {
        //Pregutan si existe:
        if (repositorio.findById(Usuario.getId_usuario()).isPresent())
            return "El Usuario ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Usuario);
            return "El Usuario se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarUsuario(Usuario Usuario) {


        if (repositorio.findById(Usuario.getId_usuario()).isPresent()){
            repositorio.save(Usuario);
            return "El Usuario se actualizo de forma exitosa";
        }
        else{
            return "El Usuario no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarUsuario(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Usuario ha sido Eliminado";
        }
        else {
            return "Ahora el Usuario no se encuentra registrado";
        }
    }
}
