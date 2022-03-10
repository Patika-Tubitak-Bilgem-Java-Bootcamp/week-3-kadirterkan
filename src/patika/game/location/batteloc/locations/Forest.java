package patika.game.location.batteloc.locations;

import patika.game.location.batteloc.BattleLoc;
import patika.game.obstacle.creatures.Vampire;

public class Forest extends BattleLoc {

    public Forest() {
        super(new Vampire());
    }
}
