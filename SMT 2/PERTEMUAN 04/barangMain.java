import java.util.Scanner;

public class barangMain {
    public static void main(String[] args) {
        transaksiBarang15 transaksi = new transaksiBarang15();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("TOKO ATK KAYLA");
            System.out.println("------------------------------");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Melakukan Pembelian");
            System.out.println("3. Tampilkan Daftar Pembelian");
            System.out.println("4. Exit");
            System.out.println("------------------------------");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                transaksi.tampilkanBarang();
            } else if (pilihan == 2) {
                System.out.print("Masukkan kode barang: ");
                String kodeBarang = sc.next();
                transaksi.melakukanPembelian(kodeBarang);
            } else if (pilihan == 3) {
                transaksi.tampilkanBarangPembelian();
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        sc.close();
    }
}