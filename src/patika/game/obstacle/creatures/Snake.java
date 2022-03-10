package patika.game.obstacle.creatures;

import patika.game.obstacle.Obstacle;

import java.util.Random;

public class Snake extends Obstacle {

    public Snake() {
        super(4L, "Yılan", 12);
    }

    public Integer getDamage() {
        Random random = new Random();
        return random.nextInt(6) + 3;
    }


}
