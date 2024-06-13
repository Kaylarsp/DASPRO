public class TransaksiRental15 {
    static int kodeTransaksi = 1;
    int kode;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental15 br;

    public TransaksiRental15(String namaPeminjam, int lamaPinjam, BarangRental15 br) {
        this.kode = kodeTransaksi++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = lamaPinjam * br.getBiayaSewa();
    }

    public int getKode() {
        return kode;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }

    public BarangRental15 getBr() {
        return br;
    }
}