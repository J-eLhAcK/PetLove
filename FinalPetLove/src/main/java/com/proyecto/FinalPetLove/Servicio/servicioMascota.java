package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Mascota;
import com.proyecto.FinalPetLove.Repositorio.repositorioMascota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioMascota {
    private repositorioMascota repositorio;

    public servicioMascota(repositorioMascota repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<Mascota> listarMascota(){
        return (ArrayList<Mascota>) repositorio.findAll();
    }


    //Metodo de buscar Mascota por Jpa


    public Mascota buscarMascota(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarMascota(Mascota Mascota) {
        //Pregutan si existe:
        if (repositorio.findById(Mascota.getId_mascota()).isPresent())
            return "El Mascota ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Mascota);
            return "El Mascota se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarMascota(Mascota Mascota) {


        if (repositorio.findById(Mascota.getId_mascota()).isPresent()){
            repositorio.save(Mascota);
            return "El Mascota se actualizo de forma exitosa";
        }
        else{
            return "El Mascota no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarMascota(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Mascota ha sido Eliminado";
        }
        else {
            return "Ahora el Mascota no se encuentra registrado";
        }
    }
}
