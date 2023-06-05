package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Rol_Usuario;
import com.proyecto.FinalPetLove.Repositorio.repositorioRol_Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioRol_Usuario {
    private repositorioRol_Usuario repositorio;

    public servicioRol_Usuario(repositorioRol_Usuario repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<Rol_Usuario> listarRol_Usuario(){
        return (ArrayList<Rol_Usuario>) repositorio.findAll();
    }


    //Metodo de buscar Rol_Usuario por Jpa


    public Rol_Usuario buscarRol_Usuario(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarRol_Usuario(Rol_Usuario Rol_Usuario) {
        //Pregutan si existe:
        if (repositorio.findById(Rol_Usuario.getId_rol_usuario()).isPresent())
            return "El Rol_Usuario ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Rol_Usuario);
            return "El Rol_Usuario se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarRol_Usuario(Rol_Usuario Rol_Usuario) {


        if (repositorio.findById(Rol_Usuario.getId_rol_usuario()).isPresent()){
            repositorio.save(Rol_Usuario);
            return "El Rol_Usuario se actualizo de forma exitosa";
        }
        else{
            return "El Rol_Usuario no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarRol_Usuario(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Rol_Usuario ha sido Eliminado";
        }
        else {
            return "Ahora el Rol_Usuario no se encuentra registrado";
        }
    }
}
