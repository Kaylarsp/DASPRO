import java.util.Scanner;

public class persegipanjang {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int panjang;
            int lebar;
            int luas;

            panjang = input.nextInt();
            lebar = input.nextInt();

            luas = (panjang * lebar);

            System.out.println(luas);
        }

    }
}
