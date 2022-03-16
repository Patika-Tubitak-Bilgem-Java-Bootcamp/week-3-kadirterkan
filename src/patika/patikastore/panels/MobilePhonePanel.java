package patika.patikastore.panels;

import patika.patikastore.Main;
import patika.patikastore.products.productgroups.MobilePhone;
import patika.patikastore.store.Store;

import java.util.List;

public class MobilePhonePanel {

    private static String line = "------------------------------------------------------------------------------------------------------------------------------";


    public void mobilePhonePanel() {
        Boolean exitFlag = false;

        while (!exitFlag) {
            switch (panelOptions()) {
                case 1:
                    listAllPhones();
                    break;
                case 2:

                default:
                    System.out.println("Wrong input !");
            }
        }

    }

    public static Integer panelOptions() {
        System.out.println("Mobile Phone Panel");
        System.out.println("1 - List All Mobile Phones");
        System.out.println("2 - Add Mobile Phone");
        System.out.println("0 - Return to Main Panel");

        System.out.print("Enter your choice : ");
        return Main.input.nextInt();
    }

    public void listAllPhones() {
        List<MobilePhone> mobilePhoneList = Store.getMobilePhoneList();

        System.out.println(line);
        MobilePhone.printPhoneVariables();
        System.out.println(line);

        for (MobilePhone phone : mobilePhoneList) {
            phone.printThisPhone();
        }

        System.out.println(line);
    }
}
