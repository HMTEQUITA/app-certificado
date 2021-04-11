package com.taller.servicio.persistence.crud;

import com.taller.servicio.persistence.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmpleadoCrudRepository extends CrudRepository<Empleado, Integer> {

    Optional<Empleado> findByEstadoAndCargoNombreCargo(boolean estado, String nombreCargo);


}
