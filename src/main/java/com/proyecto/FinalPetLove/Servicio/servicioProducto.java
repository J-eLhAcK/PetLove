package com.proyecto.FinalPetLove.Servicio;

import com.proyecto.FinalPetLove.Entidad.Inventario;
import com.proyecto.FinalPetLove.Entidad.Producto;
import com.proyecto.FinalPetLove.Entidad.Usuario;
import com.proyecto.FinalPetLove.Repositorio.repositorioProducto;
import com.proyecto.FinalPetLove.Repositorio.repositorioUsuario;
import com.proyecto.FinalPetLove.Repositorio.repositorioInventario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class servicioProducto {
    private repositorioProducto repositorio;
    private repositorioInventario repositorioInv;
    private repositorioUsuario repositorioUsu;
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



    public String agregarProducto(String idUsuario, String idInventario, Producto producto) {
        Optional<Usuario> usuarioOptional = repositorioUsu.findById(idUsuario);
        Optional<Inventario> inventarioOptional = repositorioInv.findById(idInventario);

        if (usuarioOptional.isPresent() && inventarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            Inventario inventario = inventarioOptional.get();

            producto.setUsuario(usuario);
            producto.setInventario(inventario);

            repositorio.save(producto);
            return "El Producto se registró satisfactoriamente";
        } else {
            return "ERROR AL REGISTRAR PRODUCTO. Usuario o inventario no encontrado.";
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
