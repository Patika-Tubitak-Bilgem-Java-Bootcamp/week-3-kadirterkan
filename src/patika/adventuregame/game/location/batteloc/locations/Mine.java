package patika.adventuregame.game.location.batteloc.locations;

import patika.adventuregame.game.location.batteloc.BattleLoc;
import patika.adventuregame.game.obstacle.creatures.Snake;
import patika.adventuregame.game.player.Player;

public class Mine extends BattleLoc {

    public Mine(Player player) {
        super(player, "Maden", new Snake(), 3);
    }
}
