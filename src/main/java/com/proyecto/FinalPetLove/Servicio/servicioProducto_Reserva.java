package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Producto_Reserva;
import com.proyecto.FinalPetLove.Repositorio.repositorioProducto_Reserva;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioProducto_Reserva {
    private repositorioProducto_Reserva repositorio;

    public servicioProducto_Reserva(repositorioProducto_Reserva repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<Producto_Reserva> listarProducto_Reserva(){
        return (ArrayList<Producto_Reserva>) repositorio.findAll();
    }


    //Metodo de buscar Producto_Reserva por Jpa


    public Producto_Reserva buscarProducto_Reserva(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarProducto_Reserva(Producto_Reserva Producto_Reserva) {
        //Pregutan si existe:
        if (repositorio.findById(Producto_Reserva.getId_producto_reserva()).isPresent())
            return "El Producto_Reserva ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Producto_Reserva);
            return "El Producto_Reserva se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarProducto_Reserva(Producto_Reserva Producto_Reserva) {


        if (repositorio.findById(Producto_Reserva.getId_producto_reserva()).isPresent()){
            repositorio.save(Producto_Reserva);
            return "El Producto_Reserva se actualizo de forma exitosa";
        }
        else{
            return "El Producto_Reserva no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarProducto_Reserva(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Producto_Reserva ha sido Eliminado";
        }
        else {
            return "Ahora el Producto_Reserva no se encuentra registrado";
        }
    }
}
