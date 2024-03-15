import java.util.Scanner;

public class MainSum15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=====================================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5,9)");
            
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();
            
            Sum15[] sm = new Sum15[elm];

            for (int i = 0; i < elm; i++) {
                System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + " : ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer value.");
                    sc.next();
                }
                int month = sc.nextInt();
                sm[i] = new Sum15(month);

                System.out.println("Masukkan keuntungan untuk perusahaan ke-" + (i + 1));
                for (int j = 0; j < sm[i].elemen; j++) {
                    do {
                        System.out.print("Masukkan untung bulan ke-" + (j + 1) + " : ");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Invalid input. Please enter a decimal value.");
                            sc.next();
                        }
                        sm[i].keuntungan[j] = sc.nextDouble();
                        sc.nextLine();
                    } while (sm[i].keuntungan[j] < 0);
                }
            }

            System.out.println("==============================================================");
            for (int i = 0; i < elm; i++) {
                System.out.println("Perusahaan ke-" + (i + 1));
                System.out.println("Algoritma Brute Force");
                System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + String.format("%.2f",sm[i].totalBF(sm[i].keuntungan)));
                System.out.println("Algoritma Divide Conquer");
                System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + String.format("%.2f",sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1)));
                System.out.println("==============================================================");
            }
        }
    }
}