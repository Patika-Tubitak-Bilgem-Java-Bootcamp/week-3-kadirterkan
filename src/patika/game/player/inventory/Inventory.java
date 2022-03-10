package patika.game.player.inventory;

import patika.game.player.inventory.items.Armor;
import patika.game.player.inventory.items.Weapon;

public class Inventory {

    private Boolean water;
    private Boolean food;
    private Boolean firewood;
    private Weapon weapon;
    private Armor armor;
    private Integer money;

    public Inventory() {
        this.weapon = new Weapon("Yumruk", 0L, 0, 0);
        this.armor = new Armor(0L, "Paçavra", 0, 0);
    }

    public Boolean getWater() {
        return water;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

    public Boolean getFood() {
        return food;
    }

    public void setFood(Boolean food) {
        this.food = food;
    }

    public Boolean getFirewood() {
        return firewood;
    }

    public void setFirewood(Boolean firewood) {
        this.firewood = firewood;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
