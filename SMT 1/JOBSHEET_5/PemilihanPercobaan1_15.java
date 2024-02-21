import java.util.Scanner;

/**
 * PemilihanPercobaan1_15
 */
public class PemilihanPercobaan1_15 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        int angka = input15.nextInt();

        if (angka %2 == 0) {
            System.out.println("angka = genap");
        } else {
            System.out.println("angka = ganjil");
        }
    }
}