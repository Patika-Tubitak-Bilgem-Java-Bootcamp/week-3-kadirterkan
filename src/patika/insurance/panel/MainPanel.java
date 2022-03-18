package patika.insurance.panel;

import patika.insurance.entities.AbstractAccount;
import patika.insurance.manager.AccountManager;

import java.util.Scanner;

public class MainPanel {

    public final static Scanner input = new Scanner(System.in);
    private static AccountManager system = new AccountManager();
    private static AbstractAccount account;

    public static void mainPanel() {
        System.out.println("Main panel");
        System.out.println("Please login");

        while (!login()) ;

        while (account.returnLoginStatus()) {
            panelOptions();

            switch (chooseOption()) {
                case 0:
                    account.logout();
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    private static Boolean login() {
        System.out.print("Email = ");
        String email = input.nextLine();

        System.out.print("Password = ");
        String password = input.nextLine();

        account = system.login(email, password);

        return account != null;
    }

    private static void panelOptions() {
        System.out.println("1 - Make insurance");
        System.out.println("2 - See your insurances");
        System.out.println("3 - See your addresses");
        System.out.println("4 - Add new address");
        System.out.println("0 - Log out");
    }

    private static Integer chooseOption() {
        System.out.print("Your choice : ");
        return input.nextInt();
    }
}
