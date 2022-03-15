package patika.adventuregame.game.obstacle;

import patika.adventuregame.game.common.BaseEntity;
import patika.adventuregame.game.player.Player;

public class Obstacle extends BaseEntity {

    private Integer damage;
    private Integer health;
    private Integer defaultHealth;
    private Integer award;

    public Obstacle() {

    }

    public Obstacle(Long id, String name, Integer health) {
        super(id, name);
        this.health = health;
        this.defaultHealth = health;
    }

    public Obstacle(Long id, String name, Integer damage, Integer health, Integer award) {
        super(id, name);
        this.damage = damage;
        this.health = health;
        this.defaultHealth = health;
        this.award = award;
    }

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
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public Integer getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(Integer defaultHealth) {
        this.defaultHealth = defaultHealth;
    }

    public Integer getAward() {
        return award;
    }

    public void setAward(Integer award) {
        this.award = award;
    }

    public Integer obstacleNumber() {
        return null;
    }

    public void gainAward(Player player) {
        System.out.println(this.award + " para kazandınız !");
        player.getInventory().setMoney(player.getInventory().getMoney() + this.award);
        System.out.println("Güncel Paranız : " + player.getInventory().getMoney());
        System.out.println("-----------------");
    }
}
