package patika.insurance.entities;

import java.util.Date;

public class CarInsurance extends AbstractInsurance {

    public CarInsurance(String insuranceName, Double insuranceCost, Date start, Date end) {
        super(insuranceName, insuranceCost, start, end);
    }

    @Override
    public Double calculate() {
        return null;
    }
}
