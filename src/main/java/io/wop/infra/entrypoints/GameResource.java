package io.wop.infra.entrypoints;

import io.wop.domain.Game.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import io.wop.domain.Game.model.Character;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameResource {

  private final GameService gameService;

  @PostMapping("/start")
  public String start(Model model) {
    List<Character> characters = gameService.getCharacters();
    model.addAttribute("characters", characters);
    return "characters-list";
  }

  @PostMapping("/select-character")
  public String start(@RequestParam("character") String characterId) {
    return "characters-list";
  }

}
