package patika.insurance.entities;

import java.time.Duration;

public class ResidenceInsurance extends AbstractInsurance {

    public ResidenceInsurance() {
        super();
    }

    @Override
    public Double calculate(AbstractAccount account) {
        Double duration = Double.valueOf(Duration.between(getStart().atStartOfDay(), getEnd().atStartOfDay()).toDays());

        return duration * 4 * account.getAccountFactor();
    }

    @Override
    public String getClassName() {
        return "Residence Insurance";
    }
}
