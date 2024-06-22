import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

        productList.add(new Product15("L001", "ASUS Vivobook Pro 14 OLED M3401QA-K420", 15000000));
        productList.add(new Product15("L002", "Lenovo IdeaPad Slim 3i 14ITL6", 6500000));
        productList.add(new Product15("L003", "MacBook Pro 14-inch M3", 30000000));
        productList.add(new Product15("L004", "MSI Modern 14 B11MO-042", 13000000));
        productList.add(new Product15("L005", "Samsung Galaxy Book 3 Ultra", 22500000));
        productList.add(new Product15("L006", "Lenovo ThinkPad X1 Carbon Gen 9", 28000000));
        productList.add(new Product15("L007", "HP Spectre x360 14 (2024)", 17000000));
        productList.add(new Product15("L008", "Acer Chromebook Spin 714", 8500000));
        productList.add(new Product15("L009", "Dell Inspiron 15 5510", 17000000));
        productList.add(new Product15("L010", "Axioo Pongo Studio", 29900000));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==========================");
            System.out.println("|      KAYLA'S STORE     |");
            System.out.println("|          MENU          |");
            System.out.println("==========================");
            System.out.println("| 1 | Add Product        |");
            System.out.println("| 2 | Delete Product     |");
            System.out.println("| 3 | Get Product        |");
            System.out.println("| 4 | Print All Products |");
            System.out.println("| 5 | Exit               |");
            System.out.println("==========================");
            System.out.print("Choose Menu : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("--------------------------");
                    System.out.println("|       ADD PRODUCT       |");
                    System.out.println("--------------------------");
                    System.out.print("Product ID   : ");
                    String productID = scanner.nextLine();
                    System.out.print("Product Name : ");
                    String productName = scanner.nextLine();
                    System.out.print("Price        : ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    productList.add(new Product15(productID, productName, price));
                    break;
                case 2:
                    System.out.println("--------------------------");
                    System.out.println("|     DELETE PRODUCT     |");
                    System.out.println("--------------------------");
                    System.out.print("Product ID   : ");
                    productID = scanner.nextLine();
                    productList.delete(productID);
                    break;
                case 3:
                    System.out.println("--------------------------");
                    System.out.println("|       GET PRODUCT      |");
                    System.out.println("--------------------------");
                    System.out.print("Product ID   : ");
                    productID = scanner.nextLine();
                    Product15 product = productList.get(productID);
                    if (product != null) {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println(product);
                        System.out.println("---------------------------------------------------------------------------");
                    } else {
                        System.out.println("Product not found");
                    }
                    break;
                case 4:
                    productList.printAll();
                    System.out.println("---------------------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("--------------------------");
                    System.out.println("|        THANK YOU       |");
                    System.out.println("--------------------------");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}