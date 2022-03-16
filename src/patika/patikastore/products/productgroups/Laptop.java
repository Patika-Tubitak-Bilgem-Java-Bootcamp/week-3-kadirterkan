package patika.patikastore.products.productgroups;

import patika.patikastore.products.Brand;
import patika.patikastore.products.ProductGroup;

public class Laptop extends ProductGroup {

    private String RAM;
    private String storage;
    private String screenSize;

    public Laptop(Integer productsRegisteredUniqueSystemNumber,
                  Integer unitPrice,
                  Integer discountRatio,
                  Integer stockAmount,
                  Integer productName,
                  Brand brandInfo,
                  String RAM,
                  String storage,
                  String screenSize) {
        super(productsRegisteredUniqueSystemNumber,
                unitPrice,
                discountRatio,
                stockAmount,
                productName,
                brandInfo);
        this.RAM = RAM;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public static void printLaptopVariables() {
        System.out.println("| ID | Product Name                   | Price       | Brand       |   ");
    }
}
