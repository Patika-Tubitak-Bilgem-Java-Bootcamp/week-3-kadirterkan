package patika.adventuregame.game.obstacle.creatures;

import patika.adventuregame.game.obstacle.Obstacle;

public class Zombie extends Obstacle {

    public Zombie() {
        super(1L, "Zombi", 3, 10, 4);
    }

    public String getClassName() {
        return "Zombie";
    }
}
