import java.util.Scanner;

public class Lingkaran15 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int r;
            double keliling, luas, π = (3.14);

            System.out.println("Masukkan jari-jari lingkaran!");
            r = input.nextInt();

            keliling = 2 * π * r;
            luas = π * r * r;

            System.out.println("Hasil keliling adalah : "  + keliling);
            System.out.println("Hasil luas adalah : " + luas);
        }


    }
}