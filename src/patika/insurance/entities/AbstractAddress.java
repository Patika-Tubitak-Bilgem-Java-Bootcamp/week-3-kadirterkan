package patika.insurance.entities;

public abstract class AbstractAddress implements IAddress{

    private String name;
    private String address;
    private String city;
    private String state;

    public AbstractAddress(String name, String address, String city, String state) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public AbstractAddress() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void setAddressVariables(String addressName, String address, String city, String state) {
        this.name = addressName;
        this.address = address;
        this.city = city;
        this.state = state;
    }
}
