import java.util.Scanner;

public class lingkaran {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int phi;
            int r;
            int luas;

            phi = input.nextInt(22/7);
            r = input.nextInt();

            luas = phi * r * r;

            System.out.println(luas);
        }

    }
}
