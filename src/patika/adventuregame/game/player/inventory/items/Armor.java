package patika.adventuregame.game.player.inventory.items;

import patika.adventuregame.game.common.BaseEntity;

public class Armor extends BaseEntity {

    private Integer block;
    private Integer price;

    public Armor(Long id, String name, Integer block, Integer price) {
        super(id, name);
        this.block = block;
        this.price = price;
    }

    public static Armor[] armors() {
        return new Armor[]{new Armor(1L, "Hafif", 1, 15),
                new Armor(2L, "Orta", 1, 25),
                new Armor(3L, "Ağır", 1, 35)};
    }

    public static Armor getArmorById(Long id) {

        for (Armor armor : Armor.armors()) {
            if (armor.getId().equals(id)) {
                return armor;
            }
        }

        return null;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void printArmor() {
        System.out.println(this.getId() + " - " + this.getName() +
                " <Para : " + this.getPrice() + " , Zırh : " + this.getBlock() + ">");
    }
}
