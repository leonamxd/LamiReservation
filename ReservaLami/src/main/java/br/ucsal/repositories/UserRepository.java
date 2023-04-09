package br.ucsal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ucsal.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
