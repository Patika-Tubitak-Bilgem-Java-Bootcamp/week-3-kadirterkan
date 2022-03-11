package patika.game.player.inventory.items;

import patika.game.common.BaseEntity;

public class Weapon extends BaseEntity {

    private Integer damage;
    private Integer price;

    public Weapon(String name, Long id, Integer damage, Integer price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons() {
        return new Weapon[]{new Weapon("Tabanca", 1L, 2, 5), new Weapon("Kılıç", 2L, 3, 35), new Weapon("Tüfek", 3L, 7, 45)};
    }

    public static Weapon getWeaponObjByID(Long id) {

        for (Weapon w : Weapon.weapons()) {
            if (w.getId().equals(id)) {
                return w;
            }
        }

        return null;
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

    public void printWeapon() {
        System.out.println(this.getId() + " - " + this.getName() +
                " <Para : " + this.getPrice() + " , Hasar : " + this.getDamage() + ">");
    }
}
