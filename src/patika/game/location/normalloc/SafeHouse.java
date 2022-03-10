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
        gameFinished();
        this.getPlayer().setHealth(this.getPlayer().getGameChar().getHealth());
        System.out.println("Canınız yenilendi");
        System.out.println("-----------------");
        return true;
    }

    public void gameFinished() {
        if (this.getPlayer().getInventory().collectedAllAwards()) {
            System.out.println("Oyunu bitirdiniz ! Tebrikler");
            System.exit(0);
        }
    }
}
