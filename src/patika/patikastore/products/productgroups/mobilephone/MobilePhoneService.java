package patika.patikastore.products.productgroups.mobilephone;

import patika.patikastore.entities.Brand;
import patika.patikastore.entities.MobilePhone;
import patika.patikastore.store.StoreMockDatabase;

import java.util.List;

public class MobilePhoneService {

    public static void printMobilePhoneVariables() {
        System.out.format("| %2s | %-22s | %-5s | %-10s | %-7s | %-8s | %-6s | %-7s | %-3s | %-7s |\n",
                "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "Camera", "Battery", "RAM", "Color");
    }

    public static void addNewMobilePhone(Brand brand, String productName, Integer unitPrice, Integer storageInfo,
                                                Float screenSize, Integer camera, Integer batteryPower, Integer RAM, String color) {
        StoreMockDatabase.addNewMobilePhone(new MobilePhone(unitPrice, 0, 0, productName, brand,
                storageInfo, screenSize, batteryPower, camera, RAM, color));
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

    public static List<MobilePhone> getPhoneList() {
        return StoreMockDatabase.getMobilePhoneList();
    }

    public static List<MobilePhone> getMobilePhoneFilterByBrandName(Brand brand) {
        return StoreMockDatabase.getMobilePhoneListFilteredByBrandName(brand);
    }

    public static MobilePhone getMobilePhoneById(Integer id) {
        return StoreMockDatabase.getMobilePhoneById(id);
    }

    public static void removeMobilePhoneById(Integer id) {
        StoreMockDatabase.removeMobilePhoneById(id);
    }
}
