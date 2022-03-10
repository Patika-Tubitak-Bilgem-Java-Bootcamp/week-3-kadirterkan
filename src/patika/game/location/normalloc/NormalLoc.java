package patika.game.location.normalloc;

import patika.game.location.Location;
import patika.game.player.Player;

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