package com.proyecto.FinalPetLove.Repositorio;

import com.proyecto.FinalPetLove.Entidad.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioRol extends JpaRepository<Rol,String> {
}
