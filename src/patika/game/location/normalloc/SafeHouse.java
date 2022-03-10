package patika.game.location.normalloc;

import patika.game.player.Player;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player);
        setName("Güvenli Ev");
    }

    public Boolean onLocation() {
        System.out.println("-----------------");
        System.out.println("Güvenli evdesiniz");
        this.getPlayer().setHealth(this.getPlayer().getGameChar().getHealth());
        System.out.println("Canınız yenilendi");
        System.out.println("-----------------");
        return true;
    }
}
