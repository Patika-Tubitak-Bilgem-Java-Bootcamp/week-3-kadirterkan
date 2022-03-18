package patika.patikastore.entities;

public class MobilePhone extends ProductGroup {

    private Integer phonesMemoryInfo;
    private Float screenSize;
    private Integer batteryPower;
    private Integer camera;
    private Integer RAM;
    private String color;

    public MobilePhone(Integer unitPrice, Integer discountRatio, Integer stockAmount, String productName, Brand brandInfo, Integer phonesMemoryInfo, Float screenSize, Integer batteryPower, Integer camera, Integer RAM, String color) {
        super(unitPrice, discountRatio, stockAmount, productName, brandInfo);
        this.phonesMemoryInfo = phonesMemoryInfo;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.camera = camera;
        this.RAM = RAM;
        this.color = color;
    }

    public Integer getPhonesMemoryInfo() {
        return phonesMemoryInfo;
    }

    public void setPhonesMemoryInfo(Integer phonesMemoryInfo) {
        this.phonesMemoryInfo = phonesMemoryInfo;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Float screenSize) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
