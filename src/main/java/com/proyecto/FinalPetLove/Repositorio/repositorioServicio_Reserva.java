package com.proyecto.FinalPetLove.Repositorio;

import com.proyecto.FinalPetLove.Entidad.Servicio_Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioServicio_Reserva extends JpaRepository<Servicio_Reserva,String> {
}
