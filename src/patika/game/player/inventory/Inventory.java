package patika.game.player.inventory;

public class Inventory {

    private Boolean water;
    private Boolean food;
    private Boolean firewood;
    private String weaponName;
    private String armorName;
    private Integer weaponDamage;
    private Integer armorDefence;

    public Inventory(Boolean water,
                     Boolean food,
                     Boolean firewood,
                     String weaponName,
                     String armorName,
                     Integer weaponDamage,
                     Integer armorDefence) {
        this.water = water;
        this.food = food;
        this.firewood = firewood;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDamage = weaponDamage;
        this.armorDefence = armorDefence;
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

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public Integer getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(Integer weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public Integer getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(Integer armorDefence) {
        this.armorDefence = armorDefence;
    }
}
