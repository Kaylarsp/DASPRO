import java.util.Scanner;

public class MainSum15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta. misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum15 sm = new Sum15(elm);
        System.out.println("===============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-" + (i+1) + " : ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("===============================================================");
        System.out.println("Algoritma Brute Force");
        double formattedBF = Double.parseDouble(sm.formatDouble(sm.totalBF(sm.keuntungan)));
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + formattedBF);
        // System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + sm.totalBF(sm.keuntungan));
        System.out.println("===============================================================");
        System.out.println("Algoritma Divide and Conquer");
        // System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        double formattedDC = Double.parseDouble(sm.formatDouble(sm.totalDC(sm.keuntungan, 0, sm.elemen-1)));
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + formattedDC);
    }
}