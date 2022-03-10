package patika.game.player.gamechar.characters;

import patika.game.player.gamechar.GameChar;

public class Samurai extends GameChar {

    public Samurai() {
        super();
        this.setDamage(5);
        this.setHealth(21);
        this.setMoney(15);
        this.setId(1L);
        this.setName("Samuray");
    }
}
