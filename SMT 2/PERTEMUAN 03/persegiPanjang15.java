import java.util.Scanner;

public class persegiPanjang15 {
    public int panjang;
    public int lebar;
}

class persegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        persegiPanjang15[] arrayOfPersegiPanjang = new persegiPanjang15[3];
        
        // menerima input
        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i] = new persegiPanjang15();
            System.out.println("\nPersegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar   : ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        }

        // mengakses isi array arrayOfPersegiPanjang dan menampilkannya
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPersegi panjang ke-" + i);
            System.out.println("Panjang : " + arrayOfPersegiPanjang[i].panjang + "\nLebar   : " + arrayOfPersegiPanjang[i].lebar);
        }

        arrayOfPersegiPanjang[0] = new persegiPanjang15();
        arrayOfPersegiPanjang[0].panjang = 110;
        arrayOfPersegiPanjang[0].lebar = 30;

        arrayOfPersegiPanjang[1] = new persegiPanjang15();
        arrayOfPersegiPanjang[1].panjang = 80;
        arrayOfPersegiPanjang[1].lebar = 40;

        arrayOfPersegiPanjang[2] = new persegiPanjang15();
        arrayOfPersegiPanjang[2].panjang = 100;
        arrayOfPersegiPanjang[2].lebar = 20;

        // System.out.println();
        // System.out.println("Persegi panjang ke-0, panjang : " + arrayOfPersegiPanjang[0].panjang + ", lebar : " + arrayOfPersegiPanjang[0].lebar);
        // System.out.println("Persegi panjang ke-1, panjang :  " + arrayOfPersegiPanjang[1].panjang + ", lebar : " + arrayOfPersegiPanjang[1].lebar);
        // System.out.println("Persegi panjang ke-2, panjang : " + arrayOfPersegiPanjang[2].panjang + ", lebar : " + arrayOfPersegiPanjang[2].lebar);
    }
}