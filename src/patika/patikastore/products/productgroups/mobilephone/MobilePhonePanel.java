package patika.patikastore.products.productgroups.mobilephone;

import patika.patikastore.Main;
import patika.patikastore.entities.Brand;
import patika.patikastore.products.brand.BrandPanel;
import patika.patikastore.store.StoreMockDatabase;

public class MobilePhonePanel {

    public static void mobilePhonePanel() {
        Boolean exitFlag = false;

        while (!exitFlag) {
            switch (panelOptions()) {
                case 0:
                    exitFlag = true;
                    break;
                case 1:
                    MobilePhoneListService.mobilePhonePanelList();
                    break;
                case 2:
                    addNewPhone();
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

    public static void addNewPhone() {
        BrandPanel.printAllBrands();
        System.out.println("\n\n Please enter the brand name");
        Main.input.nextLine();
        String brandName = Main.input.nextLine();

        Brand brand = StoreMockDatabase.getBrandByBrandName(brandName);

        System.out.println("\n Please enter the products name");
        String productName = Main.input.nextLine();

        System.out.println("\n Please enter the products price");
        Integer unitPrice = Main.input.nextInt();

        System.out.println("\n Please enter the products storage");
        Integer storageInfo = Main.input.nextInt();

        System.out.println("\n Please enter the products screen size");
        Float screenSize = Main.input.nextFloat();

        System.out.println("\n Please enter the products camera");
        Integer camera = Main.input.nextInt();

        System.out.println("\n Please enter the products battery");
        Integer batteryPower = Main.input.nextInt();

        System.out.println("\n Please enter the products ram");
        Integer RAM = Main.input.nextInt();

        Main.input.nextLine();
        System.out.println("\n Please enter the products color");
        String color = Main.input.nextLine();

        MobilePhoneService.addNewMobilePhone(brand, productName, unitPrice, storageInfo, screenSize, camera, batteryPower, RAM, color);
    }
}
