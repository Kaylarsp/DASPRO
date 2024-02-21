import java.util.Scanner;

public class pemilihan15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==============================");
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis  : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS   : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS   : ");
        int uas = sc.nextInt();

        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
        System.out.println("==============================");
        System.out.println("Nilai Akhir          : " + nilaiAkhir);
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai huruf          : A");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai huruf          : B+");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai huruf          : B");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai huruf          : C+");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai huruf          : C");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai huruf          : D");
        } else if (nilaiAkhir <= 39) {
            System.out.println("Nilai huruf          : E");
        } else {
            System.out.println("Nilai tidak valid");
        }

        System.out.println("==============================");

        if (nilaiAkhir > 50 && nilaiAkhir <= 100) {
            System.out.println("SELAMAT ANDA LULUS!");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}