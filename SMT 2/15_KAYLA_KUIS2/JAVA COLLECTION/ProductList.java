import java.util.ArrayList;
import java.util.Collections;

public class ProductList {
    private ArrayList<Product15> products;

    public ProductList() {
        products = new ArrayList<>();
    }

    public void add(Product15 product) {
        products.add(product);
    }

    public void delete(String productID) {
        products.removeIf(product -> product.getProductID().equals(productID));
    }

    public Product15 get(String productID) {
        for (Product15 product : products) {
            if (product.getProductID().equals(productID)) {
                return product;
            }
        }
        return null;
    }

    public void printAll() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("|     %-7s| %-40s | %-15s |", "ID", "Product Name", "Price");
        System.out.println("\n---------------------------------------------------------------------------");
        for (Product15 product : products) {
            System.out.println(product);
        }
    }

    public void sort() {
        Collections.sort(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }
}