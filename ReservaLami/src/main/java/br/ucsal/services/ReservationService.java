package br.ucsal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ucsal.repositories.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository repository;
}
