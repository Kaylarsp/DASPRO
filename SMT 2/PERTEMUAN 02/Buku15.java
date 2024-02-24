public class buku15 {
    String judul, pengarang;
    int halaman, stok, harga;

    public buku15() {

    }

    public buku15(String j, String p, int hal, int s, int h) {
        judul = j;
        pengarang = p;
        halaman = hal;
        stok = s;
        harga = h;
    }

    void tampilInformasi() {
        System.out.println("Judul          : " + judul);
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Jumla halaman : " + halaman);
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