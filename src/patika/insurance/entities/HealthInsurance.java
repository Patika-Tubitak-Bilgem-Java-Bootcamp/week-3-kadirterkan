package patika.insurance.entities;

import java.util.Date;

public class HealthInsurance extends AbstractInsurance {

    public HealthInsurance(String insuranceName, Double insuranceCost, Date start, Date end) {
        super(insuranceName, insuranceCost, start, end);
    }

    @Override
    public Double calculate() {
        return null;
    }
}
