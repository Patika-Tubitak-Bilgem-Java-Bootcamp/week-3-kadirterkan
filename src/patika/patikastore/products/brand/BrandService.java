package patika.patikastore.products.brand;

import patika.patikastore.entities.Brand;
import patika.patikastore.store.StoreMockDatabase;

import java.util.List;

public class BrandService {

    public static List<Brand> getBrands() {
        return StoreMockDatabase.getBrands();
    }

    public static Brand getBrandByBrandName(String brandName) {
        return StoreMockDatabase.getBrandByBrandName(brandName);
    }
}
