import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RentalSystem15 {

    List<BarangRental15> daftarBarang;
    List<TransaksiRental15> daftarTransaksi;

    public RentalSystem15() {
        this.daftarBarang = new ArrayList<>();
        this.daftarTransaksi = new ArrayList<>();
    }

    public void tambahBarang(BarangRental15 br) {
        daftarBarang.add(br);
    }

    public void tambahTransaksi(TransaksiRental15 tr) {
        daftarTransaksi.add(tr);
    }

    public void cetakDaftarBarang() {
        System.out.println("Daftar Kendaraan Rental Serba Serbi\n");
        System.out.printf("%-20s %-20s %-10s %-10s\n", "Nama Kendaraan", "Nomor TNKB", "Jenis", "Tahun | Biaya Sewa Perjam");
        for (BarangRental15 br : daftarBarang) {
            System.out.printf("%-20s %-20s %-10s %d %s\n", br.getNamaKendaraan(), br.getNoTNKB(), br.getJenisKendaraan(), br.getTahun(), "|" + br.getBiayaSewa());
        }
        System.out.println();
    }

    public void cetakDaftarTransaksi() {
        System.out.println("Daftar Transaksi Peminjaman Rental Serba Serbi\n");

        double totalPendapatan = 0;
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-17s\n", "Kode", "No TNKB", "Nama Barang", "Nama Peminjam", "Lama Pinjam", "Total Biaya");
        for (TransaksiRental15 tr : daftarTransaksi) {
            totalPendapatan += tr.getTotalBiaya();
            System.out.printf("%-10d %-15s %-15s %-15s %-15d %-17.2f\n", tr.getKode(), tr.getBr().getNoTNKB(), tr.getBr().getNamaKendaraan(), tr.getNamaPeminjam(), tr.getLamaPinjam(), tr.getTotalBiaya());
        }
        System.out.println("\nSemua transaksi berhasil dicetak");

        System.out.println("\nTOTAL PENDAPATAN RENTAL SERBA SERBI");
        System.out.printf("Pendapatan hari ini: %.2f\n", totalPendapatan);
    }

    public void urutkanTransaksi() {
        System.out.println("-------------------------------------");
        daftarTransaksi.sort((tr1, tr2) -> {
            char firstCharNama1 = tr1.getNamaPeminjam().charAt(0);
            char firstCharNama2 = tr2.getNamaPeminjam().charAt(0);
    
            if (firstCharNama1 >= 'A' && firstCharNama1 <= 'M') {
                if (firstCharNama2 >= 'A' && firstCharNama2 <= 'M') {
                    return tr1.getBr().getNoTNKB().compareToIgnoreCase(tr2.getBr().getNoTNKB());
                } else {
                    return -1;
                }
            } else {
                if (firstCharNama2 >= 'N' && firstCharNama2 <= 'Z') {
                    return tr2.getNamaPeminjam().compareToIgnoreCase(tr1.getNamaPeminjam());
                } else {
                    return 1;
                }
            }
        });
        System.out.println("Transaksi diurutkan berdasarkan huruf pertama nama lengkap dan nomor TNKB\n");
        cetakDaftarTransaksi();
    }
    
    public void prosesPeminjaman(Scanner scanner) {
        scanner.nextLine(); // Consume newline left from previous nextInt()

        System.out.println("-------------------------------------");
        System.out.println("      Masukkan Data Peminjaman");
        System.out.println("-------------------------------------");

        System.out.print("Masukkan Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();

        System.out.print("Masukkan Nomor TNKB: ");
        String noTNKB = scanner.nextLine();

        System.out.print("Masukkan Lama Pinjam (dalam jam): ");
        int lamaPinjam = scanner.nextInt();

        scanner.nextLine(); // Consume newline after nextInt()

        System.out.print("Apakah Member (ya/tidak): ");
        String memberInput = scanner.nextLine().toLowerCase();
        boolean isMember = memberInput.equals("ya");

        BarangRental15 barang = cariBarangByNoTNKB(noTNKB);

        if (barang == null) {
            System.out.println("Kendaraan dengan Nomor TNKB tersebut tidak ditemukan.");
            return;
        }

        double biayaSewaPerJam = barang.getBiayaSewa();
        if (barang.getJenisKendaraan().equalsIgnoreCase("motor")) {
            biayaSewaPerJam = 25000;
        } else if (barang.getJenisKendaraan().equalsIgnoreCase("mobil")) {
            biayaSewaPerJam = 40000;
        }

        if (cekKetersediaanBarang(noTNKB)) {
            System.out.println("Tidak bisa diproses, kendaraan sudah dipinjam orang lain.");
            return;
        }

        double totalBiaya = lamaPinjam * biayaSewaPerJam;

        if (isMember) {
            totalBiaya -= 25000;
        }

        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            totalBiaya *= 0.9;
        } else if (lamaPinjam > 78) {
            totalBiaya *= 0.8;
        }

        TransaksiRental15 transaksi = new TransaksiRental15(namaPeminjam, lamaPinjam, barang);
        transaksi.setTotalBiaya(totalBiaya); // Update the total cost in the transaction object
        tambahTransaksi(transaksi);

        System.out.println("\nDetail Peminjaman:");
        System.out.println("Nama Barang: " + barang.getNamaKendaraan());
        System.out.println("Nama Peminjam: " + namaPeminjam);
        System.out.println("Lama Pinjam: " + lamaPinjam + " jam");
        System.out.println("Total Biaya: " + totalBiaya);
        System.out.println();
    }

    private BarangRental15 cariBarangByNoTNKB(String noTNKB) {
        for (BarangRental15 br : daftarBarang) {
            if (br.getNoTNKB().equalsIgnoreCase(noTNKB)) {
                return br;
            }
        }
        return null;
    }

    private boolean cekKetersediaanBarang(String noTNKB) {
        for (TransaksiRental15 tr : daftarTransaksi) {
            if (tr.getBr().getNoTNKB().equalsIgnoreCase(noTNKB)) {
                return true; // Sudah dipinjam
            }
        }
        return false; // Belum dipinjam
    }
}