package patika.game.player.gamechar;

import patika.game.common.Common;
import patika.game.entities.BaseEntity;

public abstract class GameChar extends Common {

    private Integer damage;
    private Integer health;
    private Integer money;

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
