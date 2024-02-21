import java.util.Scanner;

public class kel_segitiga {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int alas;
            int sisi1;
            int sisi2;
            int keliling;

            alas = input.nextInt();
            sisi1 = input.nextInt();
            sisi2 = input.nextInt();

            keliling = alas + sisi1 + sisi2;

            System.out.println(keliling);
        }
    }
}
