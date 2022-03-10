package patika.game.obstacle.creatures;

import patika.game.obstacle.Obstacle;

public class Vampire extends Obstacle {

    public Vampire() {
        super(2L, "Vampir", 4, 14, 7);
    }

    public String getClassName() {
        return "Vampire";
    }
}
