package patika.patikastore.store;

import patika.patikastore.entities.Brand;
import patika.patikastore.entities.Laptop;
import patika.patikastore.entities.MobilePhone;

import java.util.ArrayList;
import java.util.List;

public class StoreMockDatabase {

    public static List<MobilePhone> mobilePhoneList = new ArrayList<>();
    public static List<Laptop> laptopList = new ArrayList<>();
    public static List<Brand> brands = new ArrayList<>();

    public StoreMockDatabase() {
        brands = setAllValues();
        mobilePhoneList = setAllMockPhoneValues();
        laptopList = setAllMockLaptopValues();
    }

    public static List<MobilePhone> getMobilePhoneList() {
        return StoreMockDatabase.mobilePhoneList;
    }

    public static void setMobilePhoneList(List<MobilePhone> mobilePhoneList) {
        mobilePhoneList = mobilePhoneList;
    }

    public static List<Laptop> getLaptopList() {
        return laptopList;
    }

    public static void setLaptopList(List<Laptop> laptopList) {
        laptopList = laptopList;
    }

    public static List<Brand> getBrands() {
        return brands;
    }

    public static void setBrands(List<Brand> brands) {
        brands = brands;
    }

    public static List<Brand> setAllValues() {
        List<Brand> mock = new ArrayList<>();

        mock.add(new Brand(0, "Apple"));
        mock.add(new Brand(1, "Asus"));
        mock.add(new Brand(2, "Casper"));
        mock.add(new Brand(3, "HP"));
        mock.add(new Brand(4, "Huawei"));
        mock.add(new Brand(5, "Lenovo"));
        mock.add(new Brand(6, "Monster"));
        mock.add(new Brand(7, "Samsung"));
        mock.add(new Brand(8, "Xiaomi"));

        return mock;
    }

    private static List<MobilePhone> setAllMockPhoneValues() {
        List<MobilePhone> mock = new ArrayList<>();

        mock.add(new MobilePhone(3199, 0, 0,
                "SAMSUNG GALAXY A51", getBrandByBrandName("Samsung"), 128,
                6.5F, 4000, 32, 6, "Black"));
        mock.add(new MobilePhone(7379, 0, 0,
                "iPhone 11 64 GB", getBrandByBrandName("Apple"), 64,
                6.1F, 3046, 5, 6, "Blue"));
        mock.add(new MobilePhone(4012, 0, 0,
                "Redmi Note 10 Pro 8GB", getBrandByBrandName("Xiaomi"), 128,
                6.5F, 4000, 35, 12, "White"));

        return mock;
    }

    private static List<Laptop> setAllMockLaptopValues() {
        List<Laptop> mock = new ArrayList<>();

        mock.add(new Laptop(7000, 0, 0, "HUAWEI Matebook 14",
                getBrandByBrandName("Huawei"), 16, 512, 14F));
        mock.add(new Laptop(3699, 0, 0, "LENOVO V14 IGL",
                getBrandByBrandName("Lenovo"), 8, 1024, 14F));
        mock.add(new Laptop(8199, 0, 0, "ASUS Tuf Gaming",
                getBrandByBrandName("Asus"), 32, 2048, 15.6F));

        return mock;
    }

    public static Brand getBrandByBrandName(String brandName) {
        for (Brand brand : StoreMockDatabase.brands) {
            if (brand.getBrandName().equals(brandName)) {
                return brand;
            }
        }
        return null;
    }

    public static void addNewMobilePhone(MobilePhone mobilePhone) {
        StoreMockDatabase.mobilePhoneList.add(mobilePhone);
    }

    public static Boolean deleteMobilePhone(Integer id) {
        for (MobilePhone mobilePhone : StoreMockDatabase.mobilePhoneList) {
            if (mobilePhone.getProductsRegisteredUniqueSystemNumber().equals(id)) {
                return StoreMockDatabase.mobilePhoneList.remove(mobilePhone);
            }
        }

        return false;
    }

    public static void addNewLaptop(Laptop laptop) {
        StoreMockDatabase.laptopList.add(laptop);
    }

    public static Boolean deleteLaptopById(Integer id) {
        for (Laptop laptop : StoreMockDatabase.laptopList) {
            if (laptop.getProductsRegisteredUniqueSystemNumber().equals(id)) {
                return StoreMockDatabase.laptopList.remove(laptop);
            }
        }

        return false;
    }

    public static Laptop getLaptopById(Integer id) {
        for (Laptop laptop : StoreMockDatabase.laptopList) {
            if (laptop.getProductsRegisteredUniqueSystemNumber().equals(id)) {
                return laptop;
            }
        }

        return null;
    }

    public static List<Laptop> getLaptopListFilterByBrand(Brand brand) {
        List<Laptop> filteredList = new ArrayList<>();
        for (Laptop laptop : StoreMockDatabase.laptopList) {
            if(laptop.getBrandInfo().equals(brand)) {
                filteredList.add(laptop);
            }
        }

        return filteredList;
    }
}
