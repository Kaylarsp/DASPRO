public class Hotel15 {
    String nama, kota;
    int harga;
    Byte bintang;

    Hotel15(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil() {
        System.out.println("Nama    : " + nama);
        System.out.println("Kota    : " + kota);
        System.out.println("Harga   : Rp." + harga);
        System.out.println("Bintang : " + bintang);
    }
}