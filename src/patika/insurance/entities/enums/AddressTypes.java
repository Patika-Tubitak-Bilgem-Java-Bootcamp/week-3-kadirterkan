package patika.insurance.entities.enums;

public enum AddressTypes {
    HOME_ADDRESS("Home Address"),
    BUS_ADDRESS("Business Address");

    private final String value;

    AddressTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
