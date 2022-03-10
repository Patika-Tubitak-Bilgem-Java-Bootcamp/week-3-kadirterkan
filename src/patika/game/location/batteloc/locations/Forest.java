package patika.game.location.batteloc.locations;

import patika.game.location.batteloc.BattleLoc;
import patika.game.obstacle.creatures.Vampire;
import patika.game.player.Player;

public class Forest extends BattleLoc {

    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "firewood", 3);
    }
}
