import java.util.ArrayList;

public class ProductList15 {
    private ArrayList<Product15> products;

    public ProductList15() {
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
}