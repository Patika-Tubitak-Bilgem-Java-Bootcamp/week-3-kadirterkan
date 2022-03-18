package patika.insurance.entities;

public class EnterpriseAccount extends AbstractAccount {

    public EnterpriseAccount(User user) {
        super(user, 0.75D);
    }

    @Override
    public void addInsurance(AbstractInsurance insurance) {
        getInsuranceList().add(insurance);
    }
}
