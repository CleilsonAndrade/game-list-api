package br.com.cleilsonandrade.gamelistapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.cleilsonandrade.gamelistapi.entities.Game;
import br.com.cleilsonandrade.gamelistapi.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
  @Query(nativeQuery = true, value = """
      SELECT tb_game.id, tb_game.title, tb_game.game_year AS gameYear, tb_game.img_url AS imgUrl,
      tb_game.short_description AS shortDescription, tb_belonging.position
      FROM tb_game
      INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
      WHERE tb_belonging.list_id = :listId
      ORDER BY tb_belonging.position
      	""")
  List<GameMinProjection> searchByList(Long listId);
}
