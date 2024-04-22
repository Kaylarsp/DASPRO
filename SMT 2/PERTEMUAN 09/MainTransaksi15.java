
import java.util.Arrays;
import java.util.Scanner;

public class MainTransaksi15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rekening15[] rekening15 = {
            new Rekening15("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"),
            new Rekening15("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"),
            new Rekening15("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"),
            new Rekening15("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"),
            new Rekening15("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"),
            new Rekening15("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca"),
            new Rekening15("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"),
            new Rekening15("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"),
            new Rekening15("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"),
            new Rekening15("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"),
            new Rekening15("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"),
            new Rekening15("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"),
            new Rekening15("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net"),
            new Rekening15("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu"),
            new Rekening15("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk"),
            new Rekening15("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca"),
            new Rekening15("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"),
            new Rekening15("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com"),
            new Rekening15("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com")
        };

        Transaksi15[] transaksi15s = {
            new Transaksi15(898214, 494048, 3587, "2021-03-09", "07:54:42"),
            new Transaksi15(205420, 200162, 775880, "2021-06-25", "10:23:00"),
            new Transaksi15(838632, 350929, 328316, "2021-09-18", "23:00:04"),
            new Transaksi15(230659, 204434, 690503, "2022-02-02", "19:10:34"),
            new Transaksi15(770592, 334245, 444267, "2020-08-11", "13:36:56"),
            new Transaksi15(685302, 451002, 376442, "2020-05-23", "07:34:53"),
            new Transaksi15(816129, 851403, 597842, "2021-07-18", "19:41:20"),
            new Transaksi15(989609, 333823, 802752, "2022-02-01", "01:13:11"),
            new Transaksi15(297103, 396116, 779589, "2021-07-03", "01:09:49"),
            new Transaksi15(66190, 259150, 619774, "2021-09-09", "03:57:30"),
            new Transaksi15(234301, 278309, 547922, "2021-08-24", "13:18:39"),
            new Transaksi15(243306, 869468, 50283, "2021-03-12", "03:40:16"),
            new Transaksi15(371045, 991242, 602034, "2021-08-06", "11:48:59"),
            new Transaksi15(395170, 97058, 472273, "2021-05-02", "10:53:31"),
            new Transaksi15(862731, 561908, 109431, "2021-07-31", "08:11:00"),
            new Transaksi15(556798, 31387, 725426, "2021-03-27", "06:18:20"),
            new Transaksi15(873982, 896213, 846142, "2021-07-18", "04:06:30"),
            new Transaksi15(774247, 739406, 775848, "2020-10-24", "01:39:00"),
            new Transaksi15(66987, 823014, 868772, "2020-12-21", "05:57:59")
        };

        System.out.println("\n========= UTS =========");
        System.out.println("1. Tampil data rekening");
        System.out.println("2. Tampil data transaksi");
        System.out.println("3. Mencari saldo > 500000");
        System.out.println("4. Sorting by name");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan : ");
        int pilihan = sc.nextInt();
        
        switch (pilihan) {
            case 1:
            System.out.println("=============================================================================================================");
            System.out.printf("%-15s %-12s %-16s %-16s %s%n", "Rekening", "Nama", "Nama Ibu", "No hp" , "Email");
            System.out.println("=============================================================================================================");
            for (Rekening15 r : rekening15) {
                System.out.printf("%-15s %-12s %-16s %-16s %s%n", r.noRekening, r.nama, r.namaIbu, r.phone, r.email);
            }
            break;
            case 2:
            System.out.println("=========================================================");
            System.out.printf("%-12s %-12s %-12s %-12s %n", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal transaksi");
            System.out.println("=========================================================");
            for (Transaksi15 t : transaksi15s) {
                System.out.printf("%-12s %-12s %-12s %-12s %n", t.saldo, t.saldoAwal, t.saldoAkhir, t.tanggalTransaksi);
            }
            break;
            case 3:
            System.out.println("=========================================================");
            System.out.println("          Rekening dengan saldo lebih dari 500000");
            System.out.println("---------------------------------------------------------");
            System.out.printf("%-12s %-12s %-12s %-12s %n", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal transaksi");
            System.out.println("=========================================================");

            for (Transaksi15 t : transaksi15s) {
                if (t.saldo > 500000) {
                    System.out.printf("%-12s %-12s %-12s %-12s %n", t.saldo, t.saldoAwal, t.saldoAkhir, t.tanggalTransaksi, t.type);
                }
            }
            break;
            case 4:
            for (int i = 0; i < rekening15.length - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < rekening15.length - i - 1; j++) {
                    if (rekening15[j].nama.compareTo(rekening15[j + 1].nama) > 0) {
                        Rekening15 temp = rekening15[j];
                        rekening15[j] = rekening15[j + 1];
                        rekening15[j + 1] = temp;
                        swapped = true;
                    }
                }
                // optimalisasi
                if (!swapped) {
                    break;
                }
            }
            System.out.println(" ");
            System.out.println("Data rekening setelah diurutkan berdasarkan nama:");
            System.out.println("=============================================================================================================");
            System.out.printf("%-15s %-12s %-16s %-16s %s%n", "Rekening", "Nama", "Nama Ibu", "No hp" , "Email");
            System.out.println("=============================================================================================================");
            for (Rekening15 rekening : rekening15) {
                System.out.printf("%-15s %-12s %-16s %-16s %s%n", rekening.noRekening, rekening.nama, rekening.namaIbu, rekening.phone, rekening.email);
            }
            break;
            case 5:
            System.exit(0);
        }
    }
}