package io.wop.domain.Game.repository;

import io.wop.domain.Game.model.Character;
import java.util.List;

public interface GameRepository {
  List<Character> getCharacters();
}
