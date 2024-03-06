public class barang15 {
    String namaBarang, kodeBarang;
    int stok, hargaSatuan;

    public barang15(String namaBarang, String kodeBarang, int stok, int hargaSatuan) {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }
}
