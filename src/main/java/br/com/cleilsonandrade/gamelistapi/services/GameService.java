package br.com.cleilsonandrade.gamelistapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cleilsonandrade.gamelistapi.dto.GameDTO;
import br.com.cleilsonandrade.gamelistapi.dto.GameMinDTO;
import br.com.cleilsonandrade.gamelistapi.entities.Game;
import br.com.cleilsonandrade.gamelistapi.projections.GameMinProjection;
import br.com.cleilsonandrade.gamelistapi.repositories.GameRepository;

@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    return new GameDTO(result);
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findByList(Long listId) {
    List<GameMinProjection> result = gameRepository.searchByList(listId);
    return result.stream().map(x -> new GameMinDTO(x)).toList();
  }
}
