package patika.game.entities;

import patika.game.common.Common;

public abstract class BaseEntity extends Common {

    protected String name;
    protected Integer damage;
    protected Integer cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public abstract String getClassName();
}
