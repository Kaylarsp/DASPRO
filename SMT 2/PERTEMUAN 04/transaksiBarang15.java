import java.util.ArrayList;

public class transaksiBarang15 {
    private ArrayList<barang15> barangs;
    private ArrayList<barang15> pembelians;

    public transaksiBarang15() {
        barangs = new ArrayList<>();
        pembelians = new ArrayList<>();

        // Add sample data
        barangs.add(new barang15("Buku", "B001", 10, 25000));
        barangs.add(new barang15("Pensil", "B002", 20, 5000));
        barangs.add(new barang15("Spidol", "B003", 30, 7000));
        barangs.add(new barang15("Notebook", "B004", 5, 15000));
        barangs.add(new barang15("Mouse", "B005", 8, 20000));
    }

    public void tampilkanBarang() {
        System.out.println("-------------------------------------------");
        System.out.println("              Daftar Barang                ");
        System.out.println("-------------------------------------------");
        System.out.printf("%-6s %-12s %-8s %s\n", "Kode", "Nama Barang", "Stok", "Harga");
        for (barang15 barang : barangs) {
            System.out.printf("%-6s %-12s %-8d Rp. %d\n" , barang.getKodeBarang(), barang.getNamaBarang(), barang.getStok(), barang.getHargaSatuan());
        }
        System.out.println("-------------------------------------------");
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Daftar Barang Pembelian:");
        System.out.println("------------------------------");
        for (barang15 barang : pembelians) {
            System.out.printf("%s - %s (%d) - Rp. %d\n", barang.getKodeBarang(), barang.getNamaBarang(), barang.getStok(), barang.getHargaSatuan());
        }
        System.out.println("------------------------------");
    }

    public void melakukanPembelian(String kodeBarang) {
        for (barang15 barang : barangs) {
            if (barang.getKodeBarang().equals(kodeBarang)) {
                if (barang.getStok() > 0) {
                    pembelians.add(barang);
                    barang.setStok(barang.getStok() - 1);
                    System.out.println("Berhasil membeli " + barang.getNamaBarang());
                } else {
                    System.out.println("Stok " + barang.getNamaBarang() + " habis");
                }
                return;
            }
        }
        System.out.println("------------------------------");
        System.out.println("Barang tidak ditemukan");
    }
}