package br.com.mil.sistematizacao.services;

import java.util.Optional;
import br.com.mil.sistematizacao.entities.Vehicle;

public interface IVehicleService { 

    Vehicle save(Vehicle model);

    java.util.List<Vehicle> findAll();

    Optional<Vehicle> findById(Integer id);

    Vehicle update(Vehicle model);

    void deleteById(Integer id);

}
