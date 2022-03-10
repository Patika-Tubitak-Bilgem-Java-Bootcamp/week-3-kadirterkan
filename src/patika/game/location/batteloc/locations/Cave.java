package patika.game.location.batteloc.locations;

import patika.game.location.batteloc.BattleLoc;
import patika.game.obstacle.creatures.Zombie;
import patika.game.player.Player;

public class Cave extends BattleLoc {

    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "food", 3);
    }
}
