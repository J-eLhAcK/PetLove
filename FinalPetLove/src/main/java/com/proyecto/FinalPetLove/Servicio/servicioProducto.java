package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Producto;
import com.proyecto.FinalPetLove.Repositorio.repositorioProducto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioProducto {
    private repositorioProducto repositorio;

    public servicioProducto(repositorioProducto repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<Producto> listarProducto(){
        return (ArrayList<Producto>) repositorio.findAll();
    }


    //Metodo de buscar Producto por Jpa


    public Producto buscarProducto(String id){
        if (repositorio.findById(id).isPresent());
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();

        else return null;
    }

    //Metodo para agregar:



    public String agregarProducto(Producto Producto) {
        //Pregutan si existe:
        if (repositorio.findById(Producto.getId_producto()).isPresent())
            return "El Producto ya esta registrado en nuestra veterinaria, rectifica porfavor";


        else{
            repositorio.save(Producto);
            return "El Producto se registro satisfactoriamente";
        }
    }


    //Metodo de actualizar:

    public String actualizarProducto(Producto Producto) {


        if (repositorio.findById(Producto.getId_producto()).isPresent()){
            repositorio.save(Producto);
            return "El Producto se actualizo de forma exitosa";
        }
        else{
            return "El Producto no se encuentra registrado actualemente";
        }
    }



    //Para eliminar

    public String eliminarProducto(String id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return "El Producto ha sido Eliminado";
        }
        else {
            return "Ahora el Producto no se encuentra registrado";
        }
    }
}
