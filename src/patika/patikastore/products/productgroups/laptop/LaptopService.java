package patika.patikastore.products.productgroups.laptop;

import patika.patikastore.entities.Brand;
import patika.patikastore.entities.Laptop;
import patika.patikastore.store.StoreMockDatabase;

import java.util.List;

public class LaptopService {
    public static void printLaptopVariables() {
        System.out.format("| %2s | %-22s | %-5s | %-10s | %-7s | %-9s | %-3s |\n",
                "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM");
    }

    public static void printLaptop(Laptop laptop) {
        System.out.format("| %2d | %-22s | %-5d | %-10s | %-7d | %-9f | %-3s |\n",
                laptop.getProductsRegisteredUniqueSystemNumber(),
                laptop.getProductName(),
                laptop.getUnitPrice(),
                laptop.getBrandInfo().getBrandName(),
                laptop.getStorage(),
                laptop.getScreenSize(),
                laptop.getRAM()
        );
    }

    public static void addNewLaptop(Integer unitPrice, String productName, Brand brand, Integer RAM, Integer storageInfo, Float screenSize) {
        StoreMockDatabase.addNewLaptop(new Laptop(unitPrice, 0, 0, productName, brand,
                RAM, storageInfo, screenSize));
    }

    public static void removeLaptopById(Integer id) {
        StoreMockDatabase.removeLaptopById(id);
    }

    public static Laptop getLaptopById(Integer id) {
        return StoreMockDatabase.getLaptopById(id);
    }

    public static List<Laptop> getLaptopList() {
        return StoreMockDatabase.getLaptopList();
    }

    public static List<Laptop> getLaptopListFilterByBrand(Brand brand) {
        return StoreMockDatabase.getLaptopListFilterByBrand(brand);
    }
}
