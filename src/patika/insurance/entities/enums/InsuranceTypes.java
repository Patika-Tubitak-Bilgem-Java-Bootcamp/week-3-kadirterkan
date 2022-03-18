package patika.insurance.entities.enums;

public enum InsuranceTypes {
    CAR_INSURANCE("Car Insurance"),
    HEALTH_INSURANCE("Health Insurance"),
    RESIDENCE_INSURANCE("Residence Insurance"),
    TRAVEL_INSURANCE("Travel Insurance");

    private final String value;

    InsuranceTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
