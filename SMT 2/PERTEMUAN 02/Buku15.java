public class buku15 {
    String judul, pengarang;
    int halaman, stok, harga;
    double hargaTotal, diskon;

    public buku15() {

    }

    public buku15(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok; // menggunakan this karena parameter sm atribut sm
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("\nJudul          : " + judul);
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok      : " + stok);
        System.out.println("Harga          : " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int jml) {
        hargaTotal = harga * jml;
    }

    void hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = hargaTotal * 0.05;
        }
    }

    void hitungHargaBayar() {
        hitungDiskon();
        hargaTotal -= diskon;
    }
}