package patika.insurance.entities;

public class BusinessAddress extends AbstractAddress {

    public BusinessAddress(String name, String address, String city, String state) {
        super(name, address, city, state);
    }

    public BusinessAddress() {
        super();
    }

    @Override
    public void getFullAddress() {
        System.out.print("Business Address \n Address Name : " + this.getName() + "\n" +
                "Address : " + this.getAddress() + "\n" +
                "City : " + this.getCity() + "\n" +
                "State : " + this.getState());
    }
}
