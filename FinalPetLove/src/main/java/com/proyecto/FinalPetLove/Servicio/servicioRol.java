package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Rol;
import com.proyecto.FinalPetLove.Repositorio.repositorioRol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioRol {
    private repositorioRol repositorio;

    public servicioRol(repositorioRol repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<Rol> listarRol(){
        return (ArrayList<Rol>) repositorio.findAll();
    }


    //Metodo de buscar Rol por Jpa


    public Rol buscarRol(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarRol(Rol Rol) {
        //Pregutan si existe:
        if (repositorio.findById(Rol.getId_rol()).isPresent())
            return "El Rol ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Rol);
            return "El Rol se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarRol(Rol Rol) {


        if (repositorio.findById(Rol.getId_rol()).isPresent()){
            repositorio.save(Rol);
            return "El Rol se actualizo de forma exitosa";
        }
        else{
            return "El Rol no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarRol(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Rol ha sido Eliminado";
        }
        else {
            return "Ahora el Rol no se encuentra registrado";
        }
    }
}
