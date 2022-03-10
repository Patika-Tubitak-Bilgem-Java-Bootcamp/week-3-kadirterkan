package patika.game.location;

import patika.game.location.batteloc.BattleLoc;
import patika.game.player.Player;

import java.util.Scanner;

public abstract class Location {

    protected Player player;
    protected String name;
    protected final static Scanner scanner = new Scanner(System.in);

    public Location() {
    }

    public Location(Player player) {
        this.player = player;
    }

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Boolean onLocation();

    public Boolean completedLocation() {
        if(this instanceof BattleLoc) {
            return ((BattleLoc) this).completedLocation();
        } else {
            return false;
        }
    }
}
