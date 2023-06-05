package com.proyecto.FinalPetLove.Repositorio;

import com.proyecto.FinalPetLove.Entidad.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioServicio extends JpaRepository<Servicio,String> {
}
