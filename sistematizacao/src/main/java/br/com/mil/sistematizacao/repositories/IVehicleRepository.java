package br.com.mil.sistematizacao.repositories;

import br.com.mil.sistematizacao.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehicleRepository extends JpaRepository<Vehicle, Integer> {
    
}
