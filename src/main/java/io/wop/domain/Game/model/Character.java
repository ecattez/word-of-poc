package io.wop.domain.Game.model;

import lombok.Data;

@Data
public class Character {
  private int id;
  private String name;
  private Race race;
  private Weapon weapon;

  public Character(int id, String name, Race race, Weapon weapon){
    this.id = id;
    this.name = name;
    this.race = race;
    this.weapon = weapon;
  }
}
