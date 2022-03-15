package patika.adventuregame.game.location.normalloc;

import patika.adventuregame.game.player.Player;
import patika.adventuregame.game.player.inventory.items.Armor;
import patika.adventuregame.game.player.inventory.items.Weapon;

import java.util.Scanner;

public class ToolStore extends NormalLoc {

    private final Scanner input = new Scanner(System.in);

    public ToolStore(Player player) {
        super(player);
        setPlayer(player);
    }

    public Boolean onLocation() {
        System.out.println("----Mağazaya hoşgeldiniz----");

        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("3- Çıkış Yap");
            System.out.println("Seçiminiz: ");

            Scanner scanner = new Scanner(System.in);

            int selectCase = scanner.nextInt();

            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz değer, tekrar giriniz: ");
            }

            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz");
                    showMenu = false;
                    return true;
            }
        }

        return true;
    }

    public void printWeapon() {
        System.out.println("---- Silahlar ----");

        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getId() + " - " + weapon.getName() +
                    " <Para : " + weapon.getPrice() + " , Hasar : " + weapon.getDamage() + ">");
        }

        System.out.println("0 - Çıkış Yap");
    }

    public void printArmor() {
        System.out.println("---- Zırhlar ----");

        for (Armor armor : Armor.armors()) {
            System.out.println(armor.getId() + " - " + armor.getName() +
                    " <Para : " + armor.getPrice() + " , Zırh : " + armor.getBlock() + ">");
        }

        System.out.println("0 - Çıkış Yap");
    }

    public void menu() {

    }

    private void buyWeapon() {
        System.out.println("Bir silah seçiniz");

        Integer selectWeapon = input.nextInt();

        while (selectWeapon < 0 || selectWeapon > Weapon.weapons().length) {
            System.out.println("Geçersiz değer, tekrar giriniz");
            selectWeapon = input.nextInt();
        }

        if (selectWeapon != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeapon.longValue());

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getInventory().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır ");
                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız");
                    Integer balance = this.getPlayer().getInventory().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().getInventory().setMoney(balance);
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Önceki Silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                    System.out.println("Kalan paranız :" + this.getPlayer().getInventory().getMoney());
                }
            }
        }
    }

    private void buyArmor() {
        System.out.println("Bir zırh seçiniz");

        Scanner input = new Scanner(System.in);
        Integer selectArmor = input.nextInt();

        while (selectArmor < 0 || selectArmor > Armor.armors().length) {
            System.out.println("Geçersiz değer, tekrar giriniz");
            selectArmor = input.nextInt();
        }

        if (selectArmor != 0) {
            Armor selectedArmor = Armor.getArmorById(selectArmor.longValue());

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getInventory().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır ");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız");
                    Integer balance = this.getPlayer().getInventory().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().getInventory().setMoney(balance);
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Kalan paranız :" + this.getPlayer().getInventory().getMoney());
                }
            }
        }
    }
}
