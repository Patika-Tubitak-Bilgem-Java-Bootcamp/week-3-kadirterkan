package patika.insurance.entities;

public class IndividualAccount extends AbstractAccount {

    public IndividualAccount(User user) {
        super(user, 1D);
    }

    @Override
    public void addInsurance(AbstractInsurance insurance) {
        getInsuranceList().add(insurance);
    }
}
