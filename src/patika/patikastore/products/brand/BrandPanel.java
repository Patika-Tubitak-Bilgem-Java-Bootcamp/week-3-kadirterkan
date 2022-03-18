package patika.patikastore.products.brand;

import patika.patikastore.entities.Brand;

public class BrandPanel {

    public static void printAllBrands() {
        System.out.println("Our brands");
        System.out.println("--------------------");

        for (Brand brand : BrandService.getBrands()) {
            brand.printBrand();
        }

        System.out.println("--------------------");
    }
}
