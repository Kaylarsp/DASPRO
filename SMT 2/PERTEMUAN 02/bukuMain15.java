public class bukuMain15 {
    public static void main(String[] args) {
        // // objek bk1 tdk pk konstruktor berparameter
        // buku15 bk1 = new buku15();
        // bk1.judul = "Today Ends Tomorrow Comes";
        // bk1.pengarang = "Denanda Pratiwi";
        // bk1.halaman = 198;
        // bk1.stok = 13;
        // bk1.harga = 71000;

        // bk1.tampilInformasi();
        // bk1.terjual(5);
        // bk1.gantiHarga(60000);
        // bk1.tampilInformasi();

        // // menambahkan objek bk2 pk konstruktor berparameter
        // buku15 bk2 = new buku15("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        // bk2.terjual(11);
        // bk2.tampilInformasi();

        // membuat objek baru dg nama saya
        buku15 bukuKayla = new buku15("Tentang Kamu", "Tere Liye", 503, 30, 85000);
        bukuKayla.terjual(5);
        bukuKayla.hitungHargaTotal(5);
        bukuKayla.hitungDiskon();
        bukuKayla.hitungHargaBayar();
        bukuKayla.tampilInformasi();
    }
}