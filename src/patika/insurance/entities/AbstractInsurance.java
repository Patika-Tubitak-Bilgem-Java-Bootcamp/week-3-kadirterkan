package patika.insurance.entities;

import java.time.LocalDate;

public abstract class AbstractInsurance {

    private String insuranceName;
    private Double insuranceCost;
    private LocalDate start;
    private LocalDate end;

    public AbstractInsurance() {

    }

    public abstract Double calculate(AbstractAccount account);

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public Double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(Double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public abstract String getClassName();

    @Override
    public String toString() {
        return "| Insurance Class = " + this.getClassName() + " | " +
                "Insurance name = " + this.insuranceName + " | " +
                "Insurance start date = " + this.start.toString() + " | " +
                "Insurance end time = " + this.end.toString() + " |";
    }
}
