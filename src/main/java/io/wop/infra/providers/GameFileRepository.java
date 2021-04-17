package io.wop.infra.providers;

import io.wop.domain.Game.repository.GameRepository;
import io.wop.domain.Game.model.Character;
import io.wop.domain.Game.model.Race;
import io.wop.domain.Game.model.Weapon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class GameFileRepository implements GameRepository {

  @Override
  public List<Character> getCharacters() {
    return List.of(new Character(1,"Gabin le Bloquet", Race.GOBLIN, Weapon.PIED_DE_BICHE),
      new Character(2,"Thomas le Ferro", Race.ELF, Weapon.EPEE),
      new Character(3,"Edouard le Cattez", Race.ORC, Weapon.MARTEAU)
    );
  }
}
