package patika.insurance.entities;

public interface IAddress {
    public void getFullAddress();

    public void setAddressVariables(String addressName, String address, String city, String state);
}