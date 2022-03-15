package patika.adventuregame.game.player.gamechar.characters;

import patika.adventuregame.game.player.gamechar.GameChar;

public class Archer extends GameChar {

    public Archer() {
        super();
        this.setDamage(8);
        this.setHealth(24);
        this.setMoney(20);
        this.setId(2L);
        this.setName("Okçu");
    }
}
