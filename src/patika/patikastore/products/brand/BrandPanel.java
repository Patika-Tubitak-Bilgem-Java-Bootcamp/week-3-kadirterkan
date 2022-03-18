package patika.patikastore.products.brand;

import patika.patikastore.entities.Brand;
import patika.patikastore.store.StoreMockDatabase;

public class BrandPanel {

    public static void printAllBrands() {
        System.out.println("Our brands");
        System.out.println("--------------------");

        for (Brand brand : StoreMockDatabase.getBrands()) {
            brand.printBrand();
        }

        System.out.println("--------------------");
    }
}
