package com.detroitlabs.pingpong.data;


import com.detroitlabs.pingpong.model.Player;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class PlayerRepository {

    private static final List<Player> ALL_PLAYERS = Arrays.asList(
            new Player("Jamez", "Stopped eating ice cream in the 6th grade.", 2),
            new Player("Brian", "Sunburns easily.", 11),
            new Player("Kareem", "Amateur BBQ pit master.", 3),
            new Player("Christie", "Has 2 pits rescued from the streets.", 4),
            new Player("Jamie", "Loves to read horror novels.", 5),
            new Player("Mikayla", "Takes notes.  Be careful what you say around her. :-)", 1),
            new Player("Jordan", "Puns and Dad jokes are his kind of thing.", 6),
            new Player("David", "Bites into string cheese.  He's a monster.", 7),
            new Player("Nada", "Loves kickboxing.", 8),
            new Player("Omar", "Known as Mr. Sneeze.", 9),
            new Player("Joe", "He's gonna cook you for breakfast but simply.", 10)
            );

    public List<Player> getAllPlayers() {
        return ALL_PLAYERS;
    }

    public List<Player> getByRank(){
        List<Player> playersToSort = getAllPlayers();

        Collections.sort(playersToSort, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Integer.compare(player1.getPlayerRanking(), player2.getPlayerRanking());
            }
        });

        return playersToSort;
    }
}
