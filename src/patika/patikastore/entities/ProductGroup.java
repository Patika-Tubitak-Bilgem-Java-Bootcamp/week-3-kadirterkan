package patika.patikastore.entities;

import patika.patikastore.entities.Brand;

public abstract class ProductGroup {

    private static Integer maxID = 0;
    private Integer productsRegisteredUniqueSystemNumber;
    private Integer unitPrice;
    private Integer discountRatio;
    private Integer stockAmount;
    private String productName;
    private Brand brandInfo;

    public ProductGroup(Integer unitPrice, Integer discountRatio, Integer stockAmount, String productName, Brand brandInfo) {
        this.productsRegisteredUniqueSystemNumber = Integer.valueOf(maxID++);
        this.unitPrice = unitPrice;
        this.discountRatio = discountRatio;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.brandInfo = brandInfo;
    }

    public Integer getProductsRegisteredUniqueSystemNumber() {
        return productsRegisteredUniqueSystemNumber;
    }

    public void setProductsRegisteredUniqueSystemNumber(Integer productsRegisteredUniqueSystemNumber) {
        this.productsRegisteredUniqueSystemNumber = productsRegisteredUniqueSystemNumber;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(Integer discountRatio) {
        this.discountRatio = discountRatio;
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(Brand brandInfo) {
        this.brandInfo = brandInfo;
    }
}
