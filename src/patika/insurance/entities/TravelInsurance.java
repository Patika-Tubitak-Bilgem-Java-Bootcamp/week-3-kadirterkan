package patika.insurance.entities;

import java.time.Duration;

public class TravelInsurance extends AbstractInsurance {

    public TravelInsurance() {
        super();
    }

    @Override
    public Double calculate(AbstractAccount account) {
        Double duration = Double.valueOf(Duration.between(getStart().atStartOfDay(), getEnd().atStartOfDay()).toDays());

        return duration * 0.5 * account.getAccountFactor();
    }

    @Override
    public String getClassName() {
        return "Travel Insurance";
    }
}
