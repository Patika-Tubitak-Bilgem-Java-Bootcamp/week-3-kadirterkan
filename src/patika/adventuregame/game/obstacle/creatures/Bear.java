package patika.adventuregame.game.obstacle.creatures;

import patika.adventuregame.game.obstacle.Obstacle;

public class Bear extends Obstacle {

    public Bear() {
        super(3L, "Ayı", 7, 20, 12);
    }

    public String getClassName() {
        return "Bear";
    }
}
