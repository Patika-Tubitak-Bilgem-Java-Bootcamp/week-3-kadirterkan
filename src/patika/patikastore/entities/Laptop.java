package patika.patikastore.entities;

public class Laptop extends ProductGroup {

    private Integer RAM;
    private Integer storage;
    private Float screenSize;

    public Laptop(
            Integer unitPrice,
            Integer discountRatio,
            Integer stockAmount,
            String productName,
            Brand brandInfo,
            Integer RAM,
            Integer storage,
            Float screenSize) {
        super(unitPrice,
                discountRatio,
                stockAmount,
                productName,
                brandInfo);
        this.RAM = RAM;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public static void printLaptopVariables() {
        System.out.println("| ID | Product Name                   | Price       | Brand       |   ");
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
    }
}
