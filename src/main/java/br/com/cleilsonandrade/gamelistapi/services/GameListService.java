package br.com.cleilsonandrade.gamelistapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cleilsonandrade.gamelistapi.dto.GameListDTO;
import br.com.cleilsonandrade.gamelistapi.entities.GameList;
import br.com.cleilsonandrade.gamelistapi.projections.GameMinProjection;
import br.com.cleilsonandrade.gamelistapi.repositories.GameListRepository;
import br.com.cleilsonandrade.gamelistapi.repositories.GameRepository;

@Service
public class GameListService {
  @Autowired
  private GameListRepository gameListRepository;

  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(x -> new GameListDTO(x)).toList();
  }

  public void move(Long listId, int sourceIndex, int destinationIndex) {
    List<GameMinProjection> list = gameRepository.searchByList(listId);

    GameMinProjection obj = list.remove(destinationIndex);
    list.add(destinationIndex, obj);

    int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
    int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

    for (int i = min; i <= max; i++) {
      gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
    }

  }
}
