package patika.patikastore.products.productgroups.mobilephone;

import patika.patikastore.Main;
import patika.patikastore.entities.Brand;
import patika.patikastore.entities.MobilePhone;
import patika.patikastore.products.brand.BrandPanel;
import patika.patikastore.products.brand.BrandService;

import java.util.Arrays;
import java.util.List;

public class MobilePhoneListService {
    private static List<MobilePhone> mobilePhoneList = MobilePhoneService.getPhoneList();

    public static void mobilePhonePanelList() {
        Boolean exitFlag = false;

        mobilePhoneList = MobilePhoneService.getPhoneList();

        while (!exitFlag) {
            switch (panelOptions()) {
                case 0:
                    exitFlag = true;
                    break;
                case 1:
                    listAllMobilePhones();
                    break;
                case 2:
                    listByBrand();
                    break;
                case 3:
                    listById();
                    break;
                case 4:
                    removeMobilePhoneById();
                    break;
            }
        }
    }

    private static Integer panelOptions() {
        System.out.println("Mobile Phone List");
        listLaptops();
        System.out.println("1 - List all mobile phone");
        System.out.println("2 - Filter mobile phones by brand");
        System.out.println("3 - Filter mobile phones by ID");
        System.out.println("4 - Remove Mobile Phone by ID");
        System.out.println("0 - Return to Mobile Phones Transaction Panel");
        System.out.print("Enter your choice : ");
        return Main.input.nextInt();
    }

    private static void listAllMobilePhones() {
        mobilePhoneList = MobilePhoneService.getPhoneList();
    }

    private static void listByBrand() {
        BrandPanel.printAllBrands();
        System.out.print("Enter the brands name you want to filter the products by : ");
        Main.input.nextLine();
        String brandName = Main.input.next();

        Brand brand = BrandService.getBrandByBrandName(brandName);

        mobilePhoneList = MobilePhoneService.getMobilePhoneFilterByBrandName(brand);
    }

    private static void listById() {
        System.out.print("Enter the products id you want to get : ");
        Integer id = Main.input.nextInt();

        mobilePhoneList = Arrays.asList(MobilePhoneService.getMobilePhoneById(id));
    }

    private static void removeMobilePhoneById() {
        System.out.print("Enter the products id you want to delete : ");
        Integer id = Main.input.nextInt();

        MobilePhoneService.removeMobilePhoneById(id);

        mobilePhoneList = MobilePhoneService.getPhoneList();
    }

    private static void listLaptops() {
        System.out.println(Main.line);
        MobilePhoneService.printMobilePhoneVariables();
        System.out.println(Main.line);

        for (MobilePhone mobilePhone : mobilePhoneList) {
            MobilePhoneService.printPhone(mobilePhone);
        }

        System.out.println(Main.line);
    }
}
