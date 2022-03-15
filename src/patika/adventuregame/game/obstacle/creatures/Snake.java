package patika.adventuregame.game.obstacle.creatures;

import patika.adventuregame.game.obstacle.Obstacle;
import patika.adventuregame.game.player.Player;
import patika.adventuregame.game.player.inventory.items.Armor;
import patika.adventuregame.game.player.inventory.items.Weapon;

import java.util.Locale;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Snake extends Obstacle {

    private final static SplittableRandom random = new SplittableRandom();

    public Snake() {
        super(4L, "Yılan", 12);
    }

    public Integer getDamage() {
        return random.nextInt(3, 7);
    }

    public void gainAward(Player player) {
        Integer rn = random.nextInt(1, 101);

        if (rn <= 15) {
            System.out.println("Bir silah kazandınız !");
            Weapon reward = gainWeaponAsAward();
            reward.printWeapon();

            System.out.println("----------------------");

            if (acceptReward("silahı")) {
                player.getInventory().setWeapon(gainWeaponAsAward());
            }
        } else if (rn <= 30) {
            System.out.println("Bir zırh kazandınız !");
            Armor armor = gainArmorAsAward();
            armor.printArmor();

            System.out.println("-----------------------");
            if (acceptReward("zırhı")) {
                player.getInventory().setArmor(gainArmorAsAward());
            }
        } else if (rn <= 55){
            Integer money = gainMoneyAsAward();
            System.out.println(money + " para kazandınız ! ");
            player.getInventory().setMoney(player.getInventory().getMoney() + money);

            System.out.println("Güncel Paranız : " + player.getInventory().getMoney());
            System.out.println("-----------------");
        } else {
            System.out.println("Bir şey kazanamadınız. ");
        }
    }

    private Weapon gainWeaponAsAward() {
        Integer rn = random.nextInt(1, 101);

        if (rn <= 20) {
            return Weapon.getWeaponObjByID(3L);
        } else if (rn <= 50) {
            return Weapon.getWeaponObjByID(2L);
        } else {
            return Weapon.getWeaponObjByID(1L);
        }
    }

    private Armor gainArmorAsAward() {
        Integer rn = random.nextInt(1, 101);

        if (rn <= 20) {
            return Armor.getArmorById(3L);
        } else if (rn <= 50) {
            return Armor.getArmorById(2L);
        } else {
            return Armor.getArmorById(1L);
        }
    }

    private Integer gainMoneyAsAward() {
        Integer rn = random.nextInt(1, 101);

        if(rn <= 20) {
            return 10;
        } else if (rn <= 50) {
            return 5;
        } else {
            return 1;
        }
    }

    private Boolean acceptReward(String reward) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bu " + reward + " envanterinize alacak mısınız?");
        System.out.println("<E>vet ya da <H>ayır");

        String input = scanner.nextLine();
        input = input.toUpperCase(Locale.ROOT);

        return input.equals("E");
    }
}
