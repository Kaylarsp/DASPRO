import java.util.Scanner;

public class HargaBayar15 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int harga, jumlah, jmlhalbuku;
            double dis, total, bayar, jmlDis;

            System.out.println("Masukkan harga barang");
            harga = input.nextInt();
            System.out.println("Masukkan jumlah barang");
            jumlah = input.nextInt();
            System.out.println("Masukkan jumlah halaman buku");
            jmlhalbuku = input.nextInt();
            System.out.println("Masukkan jumlah diskon");
            dis = input.nextDouble();

            System.out.println("Masukkan merk buku");
            String merk = input.nextLine();

            total = harga * jumlah;
            jmlDis = total * dis;
            bayar = total - jmlDis;

            System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
            System.out.println("Jumlah yang harus dibayar adalah " + bayar);

            
        }

    }
}
