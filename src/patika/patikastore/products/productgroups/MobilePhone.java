package patika.patikastore.products.productgroups;

import patika.patikastore.products.Brand;
import patika.patikastore.products.ProductGroup;

public class MobilePhone extends ProductGroup {

    private Integer phonesMemoryInfo;
    private Double screenSize;
    private Integer batteryPower;
    private Integer camera;
    private Integer RAM;
    private Integer storageInfo;
    private String color;

    public MobilePhone(Integer productsRegisteredUniqueSystemNumber, Integer unitPrice, Integer discountRatio, Integer stockAmount, Integer productName, Brand brandInfo, Integer phonesMemoryInfo, Double screenSize, Integer batteryPower, Integer camera, Integer RAM, Integer storageInfo, String color) {
        super(productsRegisteredUniqueSystemNumber, unitPrice, discountRatio, stockAmount, productName, brandInfo);
        this.phonesMemoryInfo = phonesMemoryInfo;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.camera = camera;
        this.RAM = RAM;
        this.storageInfo = storageInfo;
        this.color = color;
    }

    public Integer getPhonesMemoryInfo() {
        return phonesMemoryInfo;
    }

    public void setPhonesMemoryInfo(Integer phonesMemoryInfo) {
        this.phonesMemoryInfo = phonesMemoryInfo;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(Integer batteryPower) {
        this.batteryPower = batteryPower;
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        this.camera = camera;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getStorageInfo() {
        return storageInfo;
    }

    public void setStorageInfo(Integer storageInfo) {
        this.storageInfo = storageInfo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void printPhoneVariables() {
        System.out.println("| ID | Product Name                   | Price       | Brand      | Storage  | Screen | Camera | Battery | RAM    | Color     |");
    }

    public void printThisPhone() {
        System.out.format("| %d | %s | %d | %s | %d | %d | %d | %d | %d | %s |",
                this.getProductsRegisteredUniqueSystemNumber(),
                this.getProductName(),
                this.getUnitPrice(),
                this.getBrandInfo().getBrandName(),
                this.getStorageInfo(),
                this.getScreenSize(),
                this.getCamera(),
                this.getBatteryPower(),
                this.getRAM(),
                this.getColor());
    }
}
