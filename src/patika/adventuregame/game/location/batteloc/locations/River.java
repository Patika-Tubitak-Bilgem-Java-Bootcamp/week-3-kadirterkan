package patika.adventuregame.game.location.batteloc.locations;

import patika.adventuregame.game.location.batteloc.BattleLoc;
import patika.adventuregame.game.obstacle.creatures.Bear;
import patika.adventuregame.game.player.Player;

public class River extends BattleLoc {

    public River(Player player) {
        super(player, "Nehir", new Bear(), "water", 3);
    }
}
