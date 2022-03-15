package patika.adventuregame.game.location.batteloc.locations;

import patika.adventuregame.game.location.batteloc.BattleLoc;
import patika.adventuregame.game.obstacle.creatures.Vampire;
import patika.adventuregame.game.player.Player;

public class Forest extends BattleLoc {

    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "firewood", 3);
    }
}
