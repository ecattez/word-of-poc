package io.wop.domain.Game.service;

import io.wop.domain.Game.repository.GameRepository;
import io.wop.domain.Game.model.Character;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

  private final GameRepository gameRepository;

  @Override
  public List<Character> getCharacters() {
    return gameRepository.getCharacters();
  }
}
