package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Servicio_Reserva;
import com.proyecto.FinalPetLove.Repositorio.repositorioServicio_Reserva;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioServicio_Reserva {
    private repositorioServicio_Reserva repositorio;

    public servicioServicio_Reserva(repositorioServicio_Reserva repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<Servicio_Reserva> listarServicio_Reserva(){
        return (ArrayList<Servicio_Reserva>) repositorio.findAll();
    }


    //Metodo de buscar Servicio_Reserva por Jpa


    public Servicio_Reserva buscarServicio_Reserva(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarServicio_Reserva(Servicio_Reserva Servicio_Reserva) {
        //Pregutan si existe:
        if (repositorio.findById(Servicio_Reserva.getId_servicio_reserva()).isPresent())
            return "El Servicio_Reserva ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Servicio_Reserva);
            return "El Servicio_Reserva se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarServicio_Reserva(Servicio_Reserva Servicio_Reserva) {


        if (repositorio.findById(Servicio_Reserva.getId_servicio_reserva()).isPresent()){
            repositorio.save(Servicio_Reserva);
            return "El Servicio_Reserva se actualizo de forma exitosa";
        }
        else{
            return "El Servicio_Reserva no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarServicio_Reserva(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Servicio_Reserva ha sido Eliminado";
        }
        else {
            return "Ahora el Servicio_Reserva no se encuentra registrado";
        }
    }
}
