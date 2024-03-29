package br.com.cleilsonandrade.gamelistapi.dto;

import br.com.cleilsonandrade.gamelistapi.entities.GameList;

public class GameListDTO {
  private Long id;
  private String name;

  public GameListDTO() {
  }

  public GameListDTO(GameList entity) {
    this.id = entity.getId();
    this.name = entity.getName();
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

}
