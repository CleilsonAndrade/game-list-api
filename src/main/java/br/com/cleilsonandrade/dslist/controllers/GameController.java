package br.com.cleilsonandrade.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleilsonandrade.dslist.dto.GameDTO;
import br.com.cleilsonandrade.dslist.dto.GameMinDTO;
import br.com.cleilsonandrade.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameMinDTO> findAll() {
    List<GameMinDTO> result = gameService.findAll();
    return result;
  }

  @GetMapping(value = "/{id}")
  public GameDTO findById(@PathVariable Long id) {
    GameDTO result = gameService.findById(id);
    return result;
  }
}
