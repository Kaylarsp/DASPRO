import java.util.Scanner;

public class persegiPanjangDemo15 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        persegiPanjang15[] arrayOfPersegiPanjang = new persegiPanjang15[3];
        int panjang, lebar;
        
        // menerima input
        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i] = new persegiPanjang15();
            System.out.println("\nPersegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar   : ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new persegiPanjang15(panjang, lebar);
        }

        persegiPanjang15 persegipanjang = new persegiPanjang15();
        persegipanjang.cetakInfo(arrayOfPersegiPanjang);
    }
}