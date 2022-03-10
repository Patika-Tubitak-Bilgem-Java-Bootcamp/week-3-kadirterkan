package patika.game.location.normalloc;

public class SafeHouse extends NormalLoc {

    public SafeHouse() {
        super();
        setName("Güvenli Ev");
    }

    public Boolean onLocation() {
        System.out.println("Güvenli evdesiniz");
        System.out.println("Canınız yenilendi");
        return true;
    }
}
