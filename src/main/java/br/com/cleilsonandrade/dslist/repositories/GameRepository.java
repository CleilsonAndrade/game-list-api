package br.com.cleilsonandrade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cleilsonandrade.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
