package patika.insurance.entities;

import patika.insurance.entities.enums.AuthenticationStatus;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class AbstractAccount implements Comparable<AbstractAccount> {

    private final Double accountFactor;
    private User user;
    private AuthenticationStatus status;
    private ArrayList<AbstractInsurance> insuranceList;

    public AbstractAccount(User user, Double accountFactor) {
        this.user = user;
        this.accountFactor = accountFactor;
        this.status = AuthenticationStatus.FAIL;
        this.insuranceList = new ArrayList<>();

    }

    public final void showUserInfo() {
        System.out.println("User Info" + "\n" +
                "User's name : " + user.getName() + "\n" +
                "User's surname : " + user.getSurname() + "\n" +
                "User's email : " + user.getEmail() + "\n" +
                "User's job : " + user.getJob() + "\n" +
                "User's age : " + user.getAge() + "\n" +
                "User's last entry : " + user.getLastEntry());
        user.printAddresses();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getAccountFactor() {
        return accountFactor;
    }

    public Boolean login(String email, String password) throws InvalidAuthenticationException {
        if (this.user.getEmail().equals(email)) {
            if (this.user.getPassword().equals(password)) {
                this.status = AuthenticationStatus.SUCCESS;
                return true;
            } else {
                throw new InvalidAuthenticationException("Wrong password");
            }
        } else {
            return false;
        }
    }

    public void addAddress(IAddress address) {
        User.addAddress(this.user, address);
    }

    public void removeAddress(IAddress address) {
        User.removeAddress(this.user, address);
    }

    public Boolean returnLoginStatus() {
        return this.status == AuthenticationStatus.SUCCESS;
    }

    public abstract void addInsurance(AbstractInsurance insurance);

    @Override
    public int hashCode() {
        return this.user.hashCode();
    }

    @Override
    public int compareTo(AbstractAccount o) {
        return this.user.getClass().getName().compareTo(o.getClass().getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractAccount) {
            return ((AbstractAccount) obj).getUser().equals(this.user);
        }
        return false;
    }

    public void logout() {
        this.status = AuthenticationStatus.FAIL;
        this.user.setLastEntry(LocalDate.now());
    }

    public ArrayList<AbstractInsurance> getInsuranceList() {
        return insuranceList;
    }
}
