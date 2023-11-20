package br.com.cleilsonandrade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cleilsonandrade.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
