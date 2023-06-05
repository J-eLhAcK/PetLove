package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Inventario;
import com.proyecto.FinalPetLove.Repositorio.repositorioInventario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioInventario {
    private repositorioInventario repositorio;

    public servicioInventario(repositorioInventario repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<Inventario> listarInventario(){
        return (ArrayList<Inventario>) repositorio.findAll();
    }


    //Metodo de buscar Inventario por Jpa


    public Inventario buscarInventario(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarInventario(Inventario Inventario) {
        //Pregutan si existe:
        if (repositorio.findById(Inventario.getId_inventario()).isPresent())
            return "El Inventario ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Inventario);
            return "El Inventario se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarInventario(Inventario Inventario) {


        if (repositorio.findById(Inventario.getId_inventario()).isPresent()){
            repositorio.save(Inventario);
            return "El Inventario se actualizo de forma exitosa";
        }
        else{
            return "El Inventario no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarInventario(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Inventario ha sido Eliminado";
        }
        else {
            return "Ahora el Inventario no se encuentra registrado";
        }
    }
}
