package patika.patikastore;

import patika.patikastore.products.brand.BrandPanel;
import patika.patikastore.products.productgroups.laptop.LaptopPanelService;
import patika.patikastore.products.productgroups.mobilephone.MobilePhonePanel;
import patika.patikastore.store.StoreMockDatabase;

import java.util.Scanner;

public class Main {

    public static String line = "------------------------------------------------------------------------------------------------------------------------------";

    public final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        StoreMockDatabase store = new StoreMockDatabase();

        Boolean exitFlag = false;

        System.out.println("Welcome to hell");

        while (!exitFlag) {
            printPanel();

            switch (getInputFromUser()) {
                case 0:
                    exitFlag = true;
                    break;
                case 1:
                    LaptopPanelService.laptopPanel();
                    break;
                case 2:
                    MobilePhonePanel.mobilePhonePanel();
                    break;
                case 3:
                    BrandPanel.printAllBrands();
                    break;
            }

        }
    }

    public static void printPanel() {
        System.out.println("1 - Notebook Transactions");
        System.out.println("2 - Mobile Phone Transactions");
        System.out.println("3 - List Brand");
        System.out.println("0 - End this nightmare");
    }

    public static Integer getInputFromUser() {
        System.out.print("Your choice : ");
        return input.nextInt();
    }
}
