package br.ucsal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ucsal.models.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
