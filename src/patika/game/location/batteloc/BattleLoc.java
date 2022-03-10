package patika.game.location.batteloc;

import patika.game.obstacle.Obstacle;

public abstract class BattleLoc {

    protected Obstacle obstacle;

    public BattleLoc(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public Boolean onLocation() {
        return null;
    }

    public void combat() {
        
    }
}
