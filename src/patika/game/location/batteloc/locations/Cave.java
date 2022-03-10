package patika.game.location.batteloc.locations;

import patika.game.location.batteloc.BattleLoc;
import patika.game.obstacle.creatures.Zombie;

public class Cave extends BattleLoc {

    public Cave() {
        super(new Zombie());
    }
}
