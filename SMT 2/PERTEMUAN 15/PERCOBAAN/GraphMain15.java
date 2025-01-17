import java.util.Scanner;

public class GraphMain15 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph15 gedung = new Graph15(6);

        while (true) {
            System.out.println();
            System.out.println("------------------------");
            System.out.println("|         MENU         |");
            System.out.println("------------------------");
            System.out.println("| 1. | Add Edge        |");
            System.out.println("| 2. | Remove Edge     |");
            System.out.println("| 3. | Degree          |");
            System.out.println("| 4. | Print Graph     |");
            System.out.println("| 5. | Cek Edge        |");
            System.out.println("| 6. | Update Jarak    |");
            System.out.println("| 7. | Hitung Edge     |");
            System.out.println("| 8. | Keluar          |");
            System.out.println("------------------------");
            System.out.print("Pilih Menu : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Masukkan gedung asal  : ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak        : ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Masukkan gedung asal  : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Masukkan gedung yang akan dicek derajatnya: ");
                    asal = sc.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    System.out.println();
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.println();
                    System.out.print("Masukkan gedung asal  : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    if (gedung.adjacent(asal, tujuan)) {
                        System.out.println("Edge exists.");
                    } else {
                        System.out.println("Edge doesn't exist.");
                    }
                    break;
                case 6:
                    System.out.println();
                    System.out.print("Masukkan gedung asal  : ");
                    int asall = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuann = sc.nextInt();
                    System.out.print("Masukkan jarak baru   : ");
                    int jarakk = sc.nextInt();
                    gedung.updateJarak(asall, tujuann, jarakk);
                    break;
                case 7:
                    System.out.println();
                    int totalEdge = gedung.hitungEdge();
                    System.out.println("Total edge dalam graf : " + totalEdge);
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}