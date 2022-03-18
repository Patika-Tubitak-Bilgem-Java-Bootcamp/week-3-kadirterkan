package patika.insurance.panel.address;

import patika.insurance.entities.BusinessAddress;
import patika.insurance.entities.HomeAddress;
import patika.insurance.entities.IAddress;
import patika.insurance.panel.MainPanel;
import patika.patikastore.Main;

public class AddressManagerPanel {

    private static IAddress address;

    public static void panel() {
        Boolean exitFlag = false;

        panelOptions();

        switch (chooseOption()) {
            case 0:
                exitFlag = true;
                break;
            case 1:
                address = new HomeAddress();
                break;
            case 2:
                address = new BusinessAddress();
                break;
        }

        if (!exitFlag) {
            addAddress();
        }
    }

    private static void panelOptions() {
        System.out.println("Choose your address type");
        System.out.println("1 - Home Address");
        System.out.println("2 - Business Address");
        System.out.println("0 - Return to main panel");
    }

    private static Integer chooseOption() {
        System.out.print("Your choice : ");
        return Main.input.nextInt();
    }

    private static void addAddress() {
        System.out.print("Enter the name of your address : ");
        String addressName = Main.input.nextLine();

        System.out.print("Enter your address : ");
        String addressAsString = Main.input.nextLine();

        System.out.print("Enter the city of your address : ");
        String city = Main.input.nextLine();

        System.out.print("Enter the state of your address : ");
        String state = Main.input.nextLine();

        address.setAddressVariables(addressName, addressAsString, city, state);
    }

    public static void listAllAddresses() {
        for (IAddress address : MainPanel.getAccount().getUser().getIAddresses()) {
            address.getFullAddress();
        }
    }
}
