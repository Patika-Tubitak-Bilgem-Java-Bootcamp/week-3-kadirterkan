package patika.insurance.manager;

import patika.insurance.entities.*;

import java.time.LocalDate;
import java.util.TreeSet;

public class TestMockAccountDatabase {

    public static TreeSet<AbstractAccount> readyTheSet() {
        TreeSet<AbstractAccount> accounts = new TreeSet<>();

        User normalUser = new User("Ben", "Kenobi", "", "", "Stranger", 47, LocalDate.now());
        User.addAddress(normalUser, getTheHomeAddress());
        IndividualAccount individualAccount = new IndividualAccount(normalUser);
        accounts.add(individualAccount);

        User enterpriseUser = new User("Darth", "Vader", "sithno2@mustafar", "padme", "Dictator's right hand", 31, LocalDate.now());
        User.addAddress(enterpriseUser, getTheBusinessAddress());
        EnterpriseAccount enterpriseAccount = new EnterpriseAccount(enterpriseUser);
        accounts.add(enterpriseAccount);

        CarInsurance carInsurance = new CarInsurance();
        carInsurance.setInsuranceName("Delta-7 Jedi Starfighter");
        carInsurance.setStart(LocalDate.of(2000, 01, 01));
        carInsurance.setEnd(LocalDate.of(2010, 01, 01));
        carInsurance.setInsuranceCost(carInsurance.calculate(individualAccount));

        individualAccount.addInsurance(carInsurance);

        CarInsurance fighter = new CarInsurance();
        fighter.setInsuranceName("Darth Vader's TIE Advanced x1");
        fighter.setStart(LocalDate.of(2000, 01, 01));
        fighter.setEnd(LocalDate.of(2010, 01, 01));
        fighter.setInsuranceCost(fighter.calculate(individualAccount));

        enterpriseAccount.addInsurance(fighter);

        return accounts;
    }

    public static HomeAddress getTheHomeAddress() {
        return new HomeAddress("My Home Address", "Manhattan, NY 10036", "New York City", "New York");
    }

    public static BusinessAddress getTheBusinessAddress() {
        return new BusinessAddress("My Bussss Address", "1600 Pennsylvania Avenue NW", "Washington", "District of Columbia");
    }
}
