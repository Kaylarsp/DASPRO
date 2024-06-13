public class BarangRental15 {
    String noTNKB, namaKendaraan, jenisKendaraan;
    int tahun, biayaSewa;

    BarangRental15(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa){
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public int getTahun() {
        return tahun;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }

    // public int cariBarangByNoTNKB(String noTNKB) {
    //     for (BarangRental15 br : daftarBarang) {
    //         if (br.getNoTNKB().equalsIgnoreCase(noTNKB)) {
    //             return br;
    //         }
    //     }
    //     return null;
    // }

    // private boolean cekKetersediaanBarang(String noTNKB) {
    //     for (TransaksiRental15 tr : daftarTransaksi) {
    //         if (tr.getBr().getNoTNKB().equalsIgnoreCase(noTNKB)) {
    //             return true; // Sudah dipinjam
    //         }
    //     }
    //     return false; // Belum dipinjam
    // }
}