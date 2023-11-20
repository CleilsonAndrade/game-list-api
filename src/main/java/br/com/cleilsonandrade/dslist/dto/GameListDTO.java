package br.com.cleilsonandrade.dslist.dto;

import br.com.cleilsonandrade.dslist.entities.GameList;

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
