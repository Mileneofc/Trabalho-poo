package br.com.mil.sistematizacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mil.sistematizacao.entities.DeliveryMan;

public interface IDeliveryManRepository extends JpaRepository<DeliveryMan, Integer> {
    
}
