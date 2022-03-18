package patika.patikastore.products.productgroups.mobilephone;

import patika.patikastore.Main;
import patika.patikastore.entities.Brand;
import patika.patikastore.entities.MobilePhone;
import patika.patikastore.products.brand.BrandPanel;
import patika.patikastore.store.StoreMockDatabase;

public class MobilePhoneService {

    public static void printPhoneVariables() {
        System.out.format("| %2s | %-22s | %-5s | %-10s | %-7s | %-8s | %-6s | %-7s | %-3s | %-7s |\n",
                "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "Camera", "Battery", "RAM", "Color");
    }

    public static MobilePhone addNewMobilePhone() {
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

        return new MobilePhone(unitPrice, 0, 0, productName, brand,
                storageInfo, screenSize, batteryPower, camera, RAM, color);
    }

    public static void printPhone(MobilePhone phone) {
        System.out.format("| %2d | %-22s | %-5d | %-10s | %-7d | %-8f | %-6d | %-7d | %-3d | %-7s |\n",
                phone.getProductsRegisteredUniqueSystemNumber(),
                phone.getProductName(),
                phone.getUnitPrice(),
                phone.getBrandInfo().getBrandName(),
                phone.getPhonesMemoryInfo(),
                phone.getScreenSize(),
                phone.getCamera(),
                phone.getBatteryPower(),
                phone.getRAM(),
                phone.getColor());
    }
}
