package patika.game;

import patika.game.location.Location;
import patika.game.location.normalloc.SafeHouse;
import patika.game.location.normalloc.ToolStore;
import patika.game.player.Player;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);


    public void start() {
        System.out.println("Macera oyununa hoş geldiniz");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player();
        player.setName(playerName);
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz");
        System.out.println("Burada yaşananların hepsi gerçek");
        System.out.println("Lütfen bir karakter seçiniz");
        player.selectChar();

        Location location = null;

        while (true) {
            System.out.println("Bölgeler");
            System.out.println("1 - Güvenli Ev");
            System.out.println("2 - Mağaza");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz :");

            int selectLoc = input.nextInt();

            switch(selectLoc) {
                case 1:
                    location = new SafeHouse();
                    break;
                case 2:
                    location = new ToolStore();
                    break;
                default:
                    location = new SafeHouse();
            }
            location.setPlayer(player);

            location.onLocation();

            if (location.onLocation() == false) {
                System.out.println("Oyun bitti");
                break;
            }
        }
    }
}
