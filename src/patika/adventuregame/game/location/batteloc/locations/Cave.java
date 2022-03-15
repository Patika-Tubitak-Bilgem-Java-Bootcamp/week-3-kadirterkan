package patika.adventuregame.game.location.batteloc.locations;

import patika.adventuregame.game.location.batteloc.BattleLoc;
import patika.adventuregame.game.obstacle.creatures.Zombie;
import patika.adventuregame.game.player.Player;

public class Cave extends BattleLoc {

    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "food", 3);
    }
}
