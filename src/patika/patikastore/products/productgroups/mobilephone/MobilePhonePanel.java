package patika.patikastore.products.productgroups.mobilephone;

import patika.patikastore.Main;
import patika.patikastore.entities.MobilePhone;
import patika.patikastore.store.StoreMockDatabase;

import java.util.List;

public class MobilePhonePanel {

    public static void mobilePhonePanel() {
        Boolean exitFlag = false;

        while (!exitFlag) {
            switch (panelOptions()) {
                case 1:
                    listAllPhones();
                    break;
                case 2:
                    addNewPhone();
                    break;
                case 3:
                    exitFlag = true;
                    break;
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

    public static void listAllPhones() {
        List<MobilePhone> mobilePhoneList = StoreMockDatabase.getMobilePhoneList();

        System.out.println(Main.line);
        MobilePhoneService.printPhoneVariables();
        System.out.println(Main.line);

        for (MobilePhone phone : mobilePhoneList) {
            MobilePhoneService.printPhone(phone);
        }

        System.out.println(Main.line);
    }

    public static void addNewPhone() {
        MobilePhone phone = MobilePhoneService.addNewMobilePhone();

        StoreMockDatabase.addNewMobilePhone(phone);
    }
}
