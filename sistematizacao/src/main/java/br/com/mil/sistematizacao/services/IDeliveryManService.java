package br.com.mil.sistematizacao.services;

import java.util.List;
import java.util.Optional;
import br.com.mil.sistematizacao.entities.DeliveryMan;

public interface IDeliveryManService {

    DeliveryMan save(DeliveryMan model);

    List<DeliveryMan> findAll();

    Optional<DeliveryMan> findById(Integer id);

    DeliveryMan update(DeliveryMan model);

    void deleteById(Integer id);

}
