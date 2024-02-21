import java.util.Scanner;

public class kel_lingkaran {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int phi;
            int radius;
            int keliling;

            phi = input.nextInt(22/7);
            radius = input.nextInt();

            keliling = 2 * phi * radius;

            System.out.println(keliling);
        }
    }
}
