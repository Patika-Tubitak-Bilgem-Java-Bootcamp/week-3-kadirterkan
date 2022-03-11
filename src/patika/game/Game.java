package patika.game;

import patika.game.location.Location;
import patika.game.location.batteloc.locations.Cave;
import patika.game.location.batteloc.locations.Forest;
import patika.game.location.batteloc.locations.Mine;
import patika.game.location.batteloc.locations.River;
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
        player.printInfo();

        Location location = null;

        System.out.println("---------------------------");
        System.out.println("Oyunu tamamlamak için bütün bölgeleri canavalardan temizleyip, ödülleri toplayıp güvenli eve geri dönmen gerekmektedir. ");
        System.out.println("---------------------------");

        while (true) {
            System.out.println("\t \t \t");

            System.out.println("Bölgeler");
            System.out.println("1 - Güvenli Ev --> Burası sizin için güvenli bir ev, düşman yoktur");
            System.out.println("2 - Eşya Dükkanı --> Silah veya Zırh satın alabilirsiniz");
            System.out.println("3 - Mağara --> Ödül <Yemek> Mağaraya git, dikkatli ol zombi çıkabilir !");
            System.out.println("4 - Orman --> Ödül <Odun> Ormana git, dikkatli ol vampir çıkabilir !");
            System.out.println("5 - Nehir --> Ödül <Su> Nehire git, dikkatli ol ayı çıkabilir !");
            System.out.println("6 - Maden --> Madene git, dikkatli ol yılan çıkabilir !");
            System.out.println("0 - Çıkış Yap --> Oyunu sonlandır.");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz :");

            int selectLoc = input.nextInt();

            switch(selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (location.completedLocation()) {
                System.out.println("Bu bölgeyi zaten temizledin, başka bir bölge seç. ");
                continue;
            }

            if(location == null) {
                System.out.println("-----------------");
                System.out.println("Bu karanlık ve sisli adadan çabucak vazgeçtin");
                break;
            } else {
                player.printInfo();
            }

            if (location.onLocation() == false) {
                System.out.println("Oyun bitti");
                System.out.println("-----------------");
                break;
            }
        }
    }
}
