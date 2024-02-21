import java.util.Scanner;

public class segitiga {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int alas;
            int tinggi;
            int luas;

            alas = input.nextInt();
            tinggi = input.nextInt();

            luas = (alas * tinggi) / 2;

            System.out.println(luas);
        }
    }
}
