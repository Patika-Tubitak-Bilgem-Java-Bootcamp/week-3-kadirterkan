package patika.game.player.inventory.items;

import patika.game.common.Common;

public class Weapon extends Common {

    private Integer damage;
    private Integer price;

    public Weapon(String name, Long id, Integer damage, Integer price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = {new Weapon("Tabanca", 1L, 2, 25),
                new Weapon("Kılıç", 2L, 3, 35),
                new Weapon("Tüfek", 3L, 7, 45)};

        return weaponList;
    }
}
