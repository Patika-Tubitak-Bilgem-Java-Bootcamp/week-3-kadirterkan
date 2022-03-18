package patika.insurance.entities;

public class HomeAddress extends AbstractAddress {

    public HomeAddress(String name, String address, String city, String state) {
        super(name, address, city, state);
    }

    @Override
    public void getFullAddress() {
        System.out.print("Home Address \n Address Name : " + this.getName() + "\n" +
                "Address : " + this.getAddress() + "\n" +
                "City : " + this.getCity() + "\n" +
                "State : " + this.getState());
    }
}
