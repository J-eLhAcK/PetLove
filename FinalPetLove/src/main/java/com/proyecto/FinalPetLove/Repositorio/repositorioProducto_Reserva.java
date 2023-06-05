package com.proyecto.FinalPetLove.Repositorio;

import com.proyecto.FinalPetLove.Entidad.Producto_Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioProducto_Reserva extends JpaRepository<Producto_Reserva,String> {
}
