public class buku15 {
    String judul, pengarang;
    int halaman, stok, harga;

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
        System.out.println("Harga          : " + halaman);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}