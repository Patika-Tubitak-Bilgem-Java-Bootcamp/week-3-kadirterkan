package patika.patikastore.products.productgroups.laptop;

import patika.patikastore.Main;
import patika.patikastore.entities.Brand;
import patika.patikastore.products.brand.BrandPanel;
import patika.patikastore.store.StoreMockDatabase;

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
                    addNewLaptop();
                    break;
            }
        }
    }

    private static Integer panelOptions() {
        System.out.println("Laptop Panel");
        System.out.println("1 - List All Laptops");
        System.out.println("2 - Add Laptop");
        System.out.println("0 - Return to Main Panel");
        System.out.print("Enter your choice : ");
        return Main.input.nextInt();
    }

    private static void addNewLaptop() {
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

        System.out.println("\n Please enter the products ram");
        Integer RAM = Main.input.nextInt();

        LaptopService.addNewLaptop(unitPrice, productName, brand, RAM, storageInfo, screenSize);
    }
}
