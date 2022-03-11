package patika.game.location.batteloc.locations;

import patika.game.location.batteloc.BattleLoc;
import patika.game.obstacle.creatures.Snake;
import patika.game.player.Player;

public class Mine extends BattleLoc {

    public Mine(Player player) {
        super(player, "Maden", new Snake(), 3);
    }
}
