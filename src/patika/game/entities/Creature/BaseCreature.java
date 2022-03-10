package patika.game.entities.Creature;

import patika.game.entities.BaseEntity;

public abstract class BaseCreature extends BaseEntity {

    protected Integer health;

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
