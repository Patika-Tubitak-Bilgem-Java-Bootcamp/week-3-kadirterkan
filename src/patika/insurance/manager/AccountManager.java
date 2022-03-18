package patika.insurance.manager;

import patika.insurance.entities.AbstractAccount;
import patika.insurance.entities.InvalidAuthenticationException;

import java.util.TreeSet;

public class AccountManager {

    private TreeSet<AbstractAccount> accounts = TestMockAccountDatabase.readyTheSet();

    public AbstractAccount login (String email, String password) {
        try {
            for (AbstractAccount account : accounts) {
                if(account.login(email, password)) {
                    return account;
                }
            }
            throw new InvalidAuthenticationException("No such user is available");
        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
