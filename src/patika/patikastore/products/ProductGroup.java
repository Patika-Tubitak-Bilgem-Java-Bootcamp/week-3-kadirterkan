package patika.patikastore.products;

public abstract class ProductGroup {

    private Integer productsRegisteredUniqueSystemNumber; //Because why not, I want it that way
    private Integer unitPrice;
    private Integer discountRatio;
    private Integer stockAmount;
    private Integer productName;
    private Brand brandInfo;

    public ProductGroup(Integer productsRegisteredUniqueSystemNumber, Integer unitPrice, Integer discountRatio, Integer stockAmount, Integer productName, Brand brandInfo) {
        this.productsRegisteredUniqueSystemNumber = productsRegisteredUniqueSystemNumber;
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

    public Integer getProductName() {
        return productName;
    }

    public void setProductName(Integer productName) {
        this.productName = productName;
    }

    public Brand getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(Brand brandInfo) {
        this.brandInfo = brandInfo;
    }
}
