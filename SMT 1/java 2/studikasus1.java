import java.util.Scanner;

public class studikasus1 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int panjang;
            int lebar;
            int keliling;

            panjang = input.nextInt();
            lebar = input.nextInt();
            
            keliling = 2 * (panjang + lebar);

            System.out.println(keliling);
        }

    }


    
}