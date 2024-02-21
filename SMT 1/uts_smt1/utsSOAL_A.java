import java.util.Scanner;

public class utsSOAL_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN ===");
        System.out.println("dibuat oleh: Muhammad Rohman Al Kautsar");
        System.out.println("NIM : 2341760055");

        String nama = "";
        String alamat = "";
        String noHp = "";
        int golongan = 0;
        int masaKerja = 0;
        int jmlKehadiran = 0;
        boolean dataTerisi = false;

        String kembaliKeMenu = "y";
        do {
            System.out.println("====================");

            System.out.println("Pilih Menu");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Gaji Karyawan");
            System.out.println("====================");
            System.out.print("Menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Karyawan");
                    System.out.print("Nama: ");
                    nama = input.next();
                    System.out.print("Alamat: ");
                    alamat = input.next();
                    System.out.print("NoHp: ");
                    noHp = input.next();
                    System.out.print("Golongan (1/2/3): ");
                    golongan = input.nextInt();
                    System.out.print("Masa Kerja: ");
                    masaKerja = input.nextInt();
                    System.out.print("Jumlah Kehadiran: ");
                    jmlKehadiran = input.nextInt();
                    dataTerisi = true;

                    System.out.print("Apakah anda ingin mencetak data karyawan? (y/t)");
                    String cetak = input.next();
                    if (cetak.equalsIgnoreCase("y")) {
                        System.out.println("=====================");
                        System.out.println("Nama: " +nama);
                        System.out.println("Alamat: " +alamat);
                        System.out.println("NoHp: " +noHp);
                        System.out.println("Golongan: " +golongan);
                        System.out.println("Masa Kerja: " +masaKerja);
                        System.out.println("Jumlah Kehadiran: " +jmlKehadiran);
                    }
                    break;
                case 2:
                    if (!dataTerisi) {
                        System.out.println("Masukkan data Karyawan terlebih dahulu");
                        System.out.print("Kembali ke menu? (y/t): ");
                        kembaliKeMenu = input.next();
                        continue;
                    }
                    System.out.println("=== GAJI KARYAWAN ===");
                    double gajiPokok = 0;
                    switch (golongan) {
                        case 1:
                            gajiPokok = 2000000;
                            break;
                        case 2:
                            gajiPokok = 2500000;
                            break;
                        case 3:
                            gajiPokok = 3000000;
                            break;
                        default:
                            System.out.println("Golongan tidak valid!");
                            break;
                    }
                    double tunjanganMasaKerja = 0;
                    if (masaKerja >= 1 && masaKerja <= 5) {
                        tunjanganMasaKerja = gajiPokok * 0.1;
                    } else if (masaKerja >= 6 && masaKerja <= 8) {
                        tunjanganMasaKerja = gajiPokok * 0.2;
                    } else if (masaKerja >8) {
                        tunjanganMasaKerja = gajiPokok * 0.25;
                    }
                    double tunjanganMakan = jmlKehadiran * 35000;
                    double totalGaji = gajiPokok + tunjanganMasaKerja + tunjanganMakan;
                    System.out.println("Nama: " + nama);
                    System.out.println("Gaji Pokok: " + gajiPokok);
                    System.out.println("Tunjangan Masa Kerja: " + tunjanganMasaKerja);
                    System.out.println("Tunjangan Uang Makan: " +tunjanganMakan);
                    System.out.println("Gaji Yang Diterima: " + totalGaji);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            System.out.print("Kembali ke menu? (y/t): ");
            kembaliKeMenu = input.next();
        } while (kembaliKeMenu.equalsIgnoreCase("y"));
    }
}