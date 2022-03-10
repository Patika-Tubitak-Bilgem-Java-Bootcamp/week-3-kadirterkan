package patika.game.location.normalloc;

import patika.game.player.inventory.items.Weapon;

import java.util.Scanner;

public class ToolStore extends NormalLoc {

    public ToolStore() {
        super();
        setPlayer(player);
    }

    public Boolean onLocation() {
        System.out.println("----Mağazaya hoşgeldiniz----");
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
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz");
                return true;
        }

        return true;
    }

    public void printWeapon() {
        System.out.println("---- Silahlar ----");

        for (Weapon weapon : Weapon.weapons()) {

        }
    }

    public void printArmor() {
        System.out.println("Zırhlar");
    }

    public void menu() {

    }

    public void buy() {

    }
}
