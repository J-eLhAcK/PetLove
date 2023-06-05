package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Reserva;
import com.proyecto.FinalPetLove.Repositorio.repositorioReserva;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioReserva {
    private repositorioReserva repositorio;

    public servicioReserva(repositorioReserva repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<Reserva> listarReserva(){
        return (ArrayList<Reserva>) repositorio.findAll();
    }


    //Metodo de buscar Reserva por Jpa


    public Reserva buscarReserva(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarReserva(Reserva Reserva) {
        //Pregutan si existe:
        if (repositorio.findById(Reserva.getId_reserva()).isPresent())
            return "El Reserva ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Reserva);
            return "El Reserva se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarReserva(Reserva Reserva) {


        if (repositorio.findById(Reserva.getId_reserva()).isPresent()){
            repositorio.save(Reserva);
            return "El Reserva se actualizo de forma exitosa";
        }
        else{
            return "El Reserva no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarReserva(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Reserva ha sido Eliminado";
        }
        else {
            return "Ahora el Reserva no se encuentra registrado";
        }
    }
}
