package br.com.cleilsonandrade.dslist.dto;

import br.com.cleilsonandrade.dslist.entities.Game;

public class GameMinDTO {
  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameMinDTO(Game gameEntity) {
    this.id = gameEntity.getId();
    this.title = gameEntity.getTitle();
    this.year = gameEntity.getYear();
    this.imgUrl = gameEntity.getImgUrl();
    this.shortDescription = gameEntity.getShortDescription();
  }

  public GameMinDTO() {
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }

}
