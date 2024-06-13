import java.util.Scanner;

public class RentalMain15 {
    public static void main(String[] args) {
        RentalSystem15 rentalSystem = new RentalSystem15();

        // Menambahkan barang
        rentalSystem.tambahBarang(new BarangRental15("DK 3412 YV", "Honda Beat", "Motor", 2017, 10000));
        rentalSystem.tambahBarang(new BarangRental15("N 234 VS", "Honda Vario", "Motor", 2018, 10000));
        rentalSystem.tambahBarang(new BarangRental15("N 5342 AH", "Toyota Yaris", "Mobil", 2022, 30000));
        rentalSystem.tambahBarang(new BarangRental15("AB 4321 F", "Toyota Innova", "Mobil", 2019, 60000));
        rentalSystem.tambahBarang(new BarangRental15("B 1234 TG", "Toyota Avanza", "Mobil", 2021, 25000));

        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("                 MENU                ");
            System.out.println("-------------------------------------");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.println("-------------------------------------");
            System.out.print("Pilih (1-5) : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    rentalSystem.cetakDaftarBarang();
                    break;
                case 2:
                    rentalSystem.prosesPeminjaman(scanner);
                    break;
                case 3:
                    rentalSystem.cetakDaftarTransaksi();
                    break;
                case 4:
                    rentalSystem.urutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem rental.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-5.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}