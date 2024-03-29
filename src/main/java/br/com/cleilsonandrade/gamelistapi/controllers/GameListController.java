package br.com.cleilsonandrade.gamelistapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleilsonandrade.gamelistapi.dto.GameListDTO;
import br.com.cleilsonandrade.gamelistapi.dto.GameMinDTO;
import br.com.cleilsonandrade.gamelistapi.dto.ReplacementDTO;
import br.com.cleilsonandrade.gamelistapi.services.GameListService;
import br.com.cleilsonandrade.gamelistapi.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
  @Autowired
  private GameListService gameListService;

  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameListDTO> findAll() {
    List<GameListDTO> result = gameListService.findAll();
    return result;
  }

  @GetMapping("/{listId}/games")
  public List<GameMinDTO> findByList(@PathVariable Long listId) {
    List<GameMinDTO> result = gameService.findByList(listId);
    return result;
  }

  @PostMapping("/{listId}/replacement")
  public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
    gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
  }
}
