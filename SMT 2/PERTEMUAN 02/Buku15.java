public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga;

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