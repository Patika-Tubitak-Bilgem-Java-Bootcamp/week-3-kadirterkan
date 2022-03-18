package patika.patikastore.products.productgroups.laptop;

import patika.patikastore.Main;
import patika.patikastore.entities.Brand;
import patika.patikastore.entities.Laptop;
import patika.patikastore.products.brand.BrandPanel;
import patika.patikastore.products.brand.BrandService;

import java.util.Arrays;
import java.util.List;

public class LaptopPanelListService {

    private static List<Laptop> laptopList = LaptopService.getLaptopList();

    public static void laptopPanelList() {
        Boolean exitFlag = false;

        laptopList = LaptopService.getLaptopList();

        while (!exitFlag) {
            switch (panelOptions()) {
                case 0:
                    exitFlag = true;
                    break;
                case 1:
                    listAllLaptops();
                    break;
                case 2:
                    listByBrand();
                    break;
                case 3:
                    listById();
                    break;
                case 4:
                    removeLaptopById();
                    break;
            }
        }
    }

    private static Integer panelOptions() {
        System.out.println("Laptop List");
        listLaptops();
        System.out.println("1 - List all laptops");
        System.out.println("2 - Filter laptops by brand");
        System.out.println("3 - Filter laptop by ID");
        System.out.println("4 - Remove Laptop by ID");
        System.out.println("0 - Return to Laptop Transaction Panel");
        System.out.print("Enter your choice : ");
        return Main.input.nextInt();
    }

    private static void listAllLaptops() {
        laptopList = LaptopService.getLaptopList();
    }

    private static void listByBrand() {
        BrandPanel.printAllBrands();
        System.out.print("Enter the brands name you want to filter the products by : ");
        Main.input.nextLine();
        String brandName = Main.input.next();

        Brand brand = BrandService.getBrandByBrandName(brandName);

        laptopList = LaptopService.getLaptopListFilterByBrand(brand);
    }

    private static void listById() {
        System.out.print("Enter the products id you want to get : ");
        Integer id = Main.input.nextInt();

        laptopList = Arrays.asList(LaptopService.getLaptopById(id));
    }

    private static void removeLaptopById() {
        System.out.print("Enter the products id you want to delete : ");
        Integer id = Main.input.nextInt();

        LaptopService.removeLaptopById(id);

        laptopList = LaptopService.getLaptopList();
    }

    private static void listLaptops() {
        System.out.println(Main.line);
        LaptopService.printLaptopVariables();
        System.out.println(Main.line);

        for (Laptop laptop : laptopList) {
            LaptopService.printLaptop(laptop);
        }

        System.out.println(Main.line);
    }
}
