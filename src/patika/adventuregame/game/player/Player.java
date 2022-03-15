package patika.adventuregame.game.player;

import patika.adventuregame.game.player.gamechar.GameChar;
import patika.adventuregame.game.player.gamechar.characters.Archer;
import patika.adventuregame.game.player.gamechar.characters.Knight;
import patika.adventuregame.game.player.gamechar.characters.Samurai;
import patika.adventuregame.game.player.inventory.Inventory;

import java.util.Scanner;

public class Player {

    private static final Scanner input = new Scanner(System.in);
    private Inventory inventory;
    private GameChar gameChar;
    private String name;
    private Integer health;

    public Player() {
        this.inventory = new Inventory();
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
        this.health = gameChar.getHealth();
        this.getInventory().setMoney(gameChar.getMoney());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public Integer getTotalDamage() {
        return gameChar.getDamage() + this.getInventory().getWeapon().getDamage();
    }

    public void printInfo() {
        System.out.println("Silahınız : " + this.getInventory().getWeapon().getName() +
                ", Zırh : " + this.getInventory().getArmor().getName() +
                ", Bloklama : " + this.getInventory().getArmor().getBlock() +
                ", Hasar : " + this.getTotalDamage() +
                ", Sağlık : " + this.getHealth() +
                ", Para : " + this.getInventory().getMoney());
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

        System.out.println("Karakteriniz : " + this.getGameChar().getName() +
                ", Hasar : " + this.getGameChar().getDamage() +
                ", Sağlık : " + this.getGameChar().getHealth() +
                ", Para : " + this.getInventory().getMoney());
    }
}
