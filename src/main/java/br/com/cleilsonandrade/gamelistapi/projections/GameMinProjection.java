package br.com.cleilsonandrade.gamelistapi.projections;

public interface GameMinProjection {
  Long getId();

  String getTitle();

  Integer getGameYear();

  String getImgUrl();

  String getShortDescription();

  Integer getPosition();
}
