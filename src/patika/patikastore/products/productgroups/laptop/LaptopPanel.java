package patika.patikastore.products.productgroups.laptop;

import patika.patikastore.Main;
import patika.patikastore.entities.Laptop;
import patika.patikastore.store.StoreMockDatabase;

import java.util.List;

public class LaptopPanel {

    public static void laptopPanel() {
        Boolean exitFlag = false;

        while (!exitFlag) {
            switch (panelOptions()) {
                case 0:
                    exitFlag = true;
                    break;
                case 1:

            }
        }
    }

    public static Integer panelOptions() {
        System.out.println("Laptop Panel");
        System.out.println("1 - List All Laptops");
        System.out.println("2 - Add Laptop");
        System.out.println("0 - Return to Main Panel");
        System.out.print("Enter your choice : ");
        return Main.input.nextInt();
    }

    public static void listAllPhones() {
        List<Laptop> laptopList = StoreMockDatabase.getLaptopList();

        System.out.println(Main.line);
        LaptopService.printLaptopVariables();
        System.out.println(Main.line);

        for (Laptop laptop : laptopList) {
            LaptopService.printLaptop(laptop);
        }

        System.out.println(Main.line);
    }
}
