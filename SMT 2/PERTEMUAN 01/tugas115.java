import java.util.Scanner;

public class tugas115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        String[] kota = {
            "Bandung",
            "Jakarta",
            "Bandar Lampung",
            "Cirebon",
            "Bogor",
            "Pekalongan",
            "Semarang",
            "Surabaya",
            "Malang",
            "Tegal" };

    System.out.print("\nKode Plat : ");
    char scKode = sc.next().charAt(0);

    String kodePlat = String.valueOf(scKode).toUpperCase();
    int indexKode = -1;
    for (int i = 0; i < kode.length; i++) {
        if (kodePlat.equalsIgnoreCase(String.valueOf(kode[i]))) {
            indexKode = i;
            break;
        }
    }

    if (indexKode != -1) {
        System.out.println("Kota      : " + kota[indexKode]);
    } else {
        System.out.println("Kode plat tidak ditemukan");
    }
        sc.close();
    }
}