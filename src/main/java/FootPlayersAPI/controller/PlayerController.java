package FootPlayersAPI.controller;

import FootPlayersAPI.Entity.Player;
import FootPlayersAPI.Repository.PlayerInfoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private PlayerInfoRepository playerInfoRepository;
    public PlayerController(PlayerInfoRepository playerInfoRepository){
        this.playerInfoRepository=playerInfoRepository;
    }

    @GetMapping("/players")
    public List<Player> getAll(){
        List<Player> players = this.playerInfoRepository.findAll();
        return players;
    }



}
