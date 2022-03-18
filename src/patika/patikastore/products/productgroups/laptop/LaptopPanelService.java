package patika.patikastore.products.productgroups.laptop;

import patika.patikastore.Main;

public class LaptopPanelService {

    public static void laptopPanel() {
        Boolean exitFlag = false;

        while (!exitFlag) {
            switch (panelOptions()) {
                case 0:
                    exitFlag = true;
                    break;
                case 1:
                    LaptopPanelListService.laptopPanelList();
                    break;
                case 2:
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
}
