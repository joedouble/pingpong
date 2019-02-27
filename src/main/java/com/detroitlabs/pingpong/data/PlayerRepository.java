package com.detroitlabs.pingpong.data;


import com.detroitlabs.pingpong.model.Player;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PlayerRepository {

    private static final List<Player> ALL_PLAYERS = Arrays.asList(
            new Player("Ja'mez", "Stopped ice cream in the 6th grade.", 11),
            new Player("Brian", "Sunburns easily.", 2),
            new Player("Kareem", "Amateur BBQ pit master.", 3),
            new Player("Christie", "Has 2 pits rescued from the streets.", 4),
            new Player("Jamie", "Loves to read horror novels.", 5),
            new Player("Mikayla", "Takes notes.  Be careful what you say around her. :-)", 1),
            new Player("Jordan", "Puns and Dad jokes are his kind of thihg.", 6),
            new Player("David", "Bites into string cheese.  He's a monster.", 7),
            new Player("Nada", "Loves kickboxing.", 8),
            new Player("Omar", "Known as Mr. Sneeze.", 9),
            new Player("Joe", "He's gonna cook you for breakfast but simpley.", 10)
            );

    public List<Player> getAllPlayers() {
        return ALL_PLAYERS;
    }
}
