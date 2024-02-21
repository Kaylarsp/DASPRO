import java.util.Scanner;

public class perulangan15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n==================================");
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN");
        System.out.println("==================================");
        System.out.print("Masukkan NIM : ");
        long nim = sc.nextLong();
        System.out.println("==================================");
                
        // n = 2 digit terakhir nim
        long n = nim % 100;
        if (n < 10) {
            n += 10;
        }
        System.out.println("n : " + n);
        System.out.println("==================================");

        // ganjil = (*)
        // genap  = tetap
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 1) {
                System.out.print("*");;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}