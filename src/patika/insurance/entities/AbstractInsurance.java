package patika.insurance.entities;

import java.util.Date;

public abstract class AbstractInsurance {

    private String insuranceName;
    private Double insuranceCost;
    private Date start;
    private Date end;

    public AbstractInsurance(String insuranceName, Double insuranceCost, Date start, Date end) {
        this.insuranceName = insuranceName;
        this.insuranceCost = insuranceCost;
        this.start = start;
        this.end = end;
    }

    public abstract Double calculate();

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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
