package patika.patikastore.store;

import patika.patikastore.products.Brand;
import patika.patikastore.products.productgroups.Laptop;
import patika.patikastore.products.productgroups.MobilePhone;

import java.util.List;

public class Store {

    private static List<MobilePhone> mobilePhoneList;
    private static List<Laptop> laptopList;
    private static List<Brand> brands;

    public Store() {
    }

    public static List<MobilePhone> getMobilePhoneList() {
        return mobilePhoneList;
    }

    public static void setMobilePhoneList(List<MobilePhone> mobilePhoneList) {
        this.mobilePhoneList = mobilePhoneList;
    }

    public static List<Laptop> getLaptopList() {
        return laptopList;
    }

    public static void setLaptopList(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }

    public static List<Brand> getBrands() {
        return brands;
    }

    public static void setBrands(List<Brand> brands) {
        this.brands = brands;
    }
}
