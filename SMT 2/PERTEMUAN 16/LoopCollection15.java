import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection15 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits. stream(). forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }

        // Mengganti elemen terakhir menjadi "Strawberry"
        fruits.set(fruits.size() - 1, "Strawberry");

        // // Menambahkan tiga buah baru
        fruits.add("Mango");
        fruits.add("guava");
        fruits.add("avocado");

        // Melakukan sorting
        Collections.sort(fruits);

        // Menampilkan elemen setelah sorting
        System.out.println("\nSetelah Sorting:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
    }
}