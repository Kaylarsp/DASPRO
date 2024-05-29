import java.util.Scanner;

public class MainVaksin15 {
    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Penerima Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }
    public static void main(String[] args) throws Exception {
        VaksinasiDLL15 dll = new VaksinasiDLL15();
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor antrian : ");
                    int noAntrian = sc.nextInt();
                    System.out.print("Nama Penerima : ");
                    String nama = sc.next();
                    Vaksinasi15 nb = new Vaksinasi15(noAntrian, nama);
                    dll.addLast(nb);
                    System.out.println();
                    break;
                    case 2:
                    Vaksinasi15 penerima = dll.getFirst();
                    System.out.println(penerima.nama + " telah divaksinasi.");
                    dll.removeFirst();
                    break;
                    case 3:
                        System.out.println("-----------------------------");
                        System.out.println("Daftar Pengantri Vaksin");
                        System.out.println("-----------------------------");
                        dll.print();
                        System.out.println("Sisa Antrian : " + dll.size());
                        System.out.println();
                        break;
                    case 4:
                        return;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}