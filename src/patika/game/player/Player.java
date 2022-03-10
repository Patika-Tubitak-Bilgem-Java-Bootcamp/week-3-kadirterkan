package patika.game.player;

import patika.game.player.gamechar.GameChar;
import patika.game.player.gamechar.characters.Archer;
import patika.game.player.gamechar.characters.Knight;
import patika.game.player.gamechar.characters.Samurai;
import patika.game.player.inventory.Inventory;

import java.util.Scanner;

public class Player {

    private static final Scanner input = new Scanner(System.in);
    private Inventory inventory;
    private GameChar gameChar;
    private String name;

    public Player() {

    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public GameChar getGameChar() {
        return gameChar;
    }

    public void setGameChar(GameChar gameChar) {
        this.gameChar = gameChar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar() {

        GameChar[] charList = {new Samurai(), new Knight(), new Archer()};

        System.out.println("Karakterler");
        System.out.println("------------------");
        for (GameChar gameChar : charList) {
            System.out.println("Karakter: " + gameChar.getName() + "\t\t Hasar: " + gameChar.getDamage() + "\t\t Sağlık: " + gameChar.getHealth() + "\t\t Para: " + gameChar.getMoney());
        }
        System.out.println("------------------");
        System.out.println("Lütfen bir karakter giriniz");

        Integer selectChar = input.nextInt();
        setGameChar(charList[selectChar - 1]);

        System.out.println("Karakteriniz: " + getGameChar().getName());
    }
}
