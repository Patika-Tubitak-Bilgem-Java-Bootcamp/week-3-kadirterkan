package patika.adventuregame.game.location.normalloc;

import patika.adventuregame.game.location.Location;
import patika.adventuregame.game.player.Player;

public abstract class NormalLoc extends Location {

    public NormalLoc() {
    }

    public NormalLoc(Player player) {
        super(player);
    }

    @Override
    public Boolean onLocation() {
        return null;
    }
}