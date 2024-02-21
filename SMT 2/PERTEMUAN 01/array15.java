import java.util.Scanner;

public class array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==================================================================");
        System.out.println("|                   PROGRAM MENGHITUNG IP SEMESTER               |");
        System.out.println("==================================================================");
        System.out.println("|                           INPUT NILAI                          |");
        System.out.println("==================================================================");

        String nilaiHuruf = "";
        double bobotNilai = 0, sumNilaiSetara = 0, sks = 0, sumSKS = 0;

        String matkul[][] = {
            {"PANCASILA", "2", "", "", "" },
            {"KTI", "2", "", "", "" },
            {"CTPS", "2", "", "", "" },
            {"MATDAS", "2", "", "", "" },
            {"B.INGGRIS", "2", "", "", "" },
            {"DASPRO", "2", "", "", "" },
            {"P.DASPRO", "3", "", "", "" },
            {"K3", "2", "", "", "" },
        };

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Nilai MK " + matkul[i][0] + " : ");
            int nilai = sc.nextInt();

            if (nilai <= 100) {
                if (nilai > 80 && nilai <= 100) {
                    nilaiHuruf = "A";
                    bobotNilai = 4;
                } else if (nilai > 73 && nilai <= 80) {
                    nilaiHuruf = "B+";
                    bobotNilai = 3.5;
                } else if (nilai > 65 && nilai <= 73) {
                    nilaiHuruf = "B";
                    bobotNilai = 3;
                } else if (nilai > 60 && nilai <= 65) {
                    nilaiHuruf = "C+";
                    bobotNilai = 2.5;
                } else if (nilai > 50 && nilai <= 60) {
                    nilaiHuruf = "C";
                    bobotNilai = 2;
                } else if (nilai > 39 && nilai <= 50) {
                    nilaiHuruf = "D";
                    bobotNilai = 1;
                } else {
                    nilaiHuruf = "E";
                    bobotNilai = 0;
                }
            } else {
                System.out.println("==================================================================");
                System.out.println("|                       Nilai tidak valid!                       |");
                System.out.println("==================================================================");
                break;
            }
            matkul[i][2] = String.valueOf(nilai);
            matkul[i][3] = nilaiHuruf;
            matkul[i][4] = String.valueOf(bobotNilai);
            sks = Integer.parseInt(matkul[i][1]);

            sumSKS += sks;
            sumNilaiSetara += bobotNilai * sks;
        }

        double ip = sumNilaiSetara / sumSKS;
        System.out.println("\n==================================================================");
        System.out.println("|                       HASIL KONVERSI NILAI                     |");
        System.out.println("==================================================================");
        System.out.println("MK                Nilai Angka    Nilai Huruf          Bobot Nilai ");
        System.out.println("==================================================================");
        for (String[] content : matkul) {
            System.out.printf("%-20s %.2f           %-20s %-20s %n", content[0],
                    Float.valueOf(content[2]), content[3], (content[4]));
        }

        System.out.printf("\nIP: %.2f", ip);
        System.out.println();
        sc.close();
    }
}