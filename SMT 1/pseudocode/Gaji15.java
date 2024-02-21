import java.util.Scanner;


public class Gaji15 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jmlMasuk, jmlTdkMsk,gaji,potGaji,totalgaji;
            

            System.out.println("Masukkan jumlah masuk!");
            jmlMasuk = input.nextInt();
            System.out.println("Masukkan jumlah tidak masuk!");
            jmlTdkMsk = input.nextInt();
            System.out.println("Masukkan jumlah gaji anda");
            gaji = input.nextInt();
            System.out.println("Masukkan potongan gaji anda");
            potGaji = input.nextInt();

            totalgaji = (jmlMasuk*gaji) - (jmlTdkMsk*potGaji);
            System.out.println("Total gaji yang anda terima adalah :" + totalgaji);
        }

    }
}