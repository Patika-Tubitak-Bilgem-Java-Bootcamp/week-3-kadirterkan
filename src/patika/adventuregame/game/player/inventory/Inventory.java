package patika.adventuregame.game.player.inventory;

import patika.adventuregame.game.player.inventory.items.Armor;
import patika.adventuregame.game.player.inventory.items.Weapon;

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
        water = false;
        food = false;
        firewood = false;
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

    public void gainAward(String award) {
        switch (award) {
            case "water":
                this.water = true;
                break;
            case "food":
                this.food = true;
                break;
            case "firewood":
                this.firewood = true;
                break;
            default:
        }
    }

    public Boolean hasAward(String award) {
        switch (award) {
            case "water":
                return water;
            case "food":
                return food;
            case "firewood":
                return firewood;
            default:
                return true;
        }
    }

    public Boolean collectedAllAwards() {
        return this.water && this.food && this.firewood;
    }
}
