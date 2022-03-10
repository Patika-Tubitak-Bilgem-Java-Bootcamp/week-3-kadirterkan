package patika.game.location.batteloc.locations;

import patika.game.location.batteloc.BattleLoc;
import patika.game.obstacle.creatures.Bear;
import patika.game.player.Player;

public class River extends BattleLoc {

    public River(Player player) {
        super(player, "Nehir", new Bear(), "water", 3);
    }
}
