package com.proyecto.FinalPetLove.Repositorio;

import com.proyecto.FinalPetLove.Entidad.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioMascota extends JpaRepository<Mascota,String> {
}
