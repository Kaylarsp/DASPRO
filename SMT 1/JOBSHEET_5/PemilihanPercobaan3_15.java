import java.util.Scanner;

public class PemilihanPercobaan3_15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan angka pertama :");
        angka1 = input15.nextDouble();
        System.out.println("Masukkan angka kedua :");
        angka2 = input15.nextDouble();
        System.out.println("Masukkan operator (+ - * /) : ");
        operator = input15.next().charAt(0);
        
        switch (operator) {
            //case 1 : Penjumlahan
            case '+' :
                hasil = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + hasil);
                break;
            //case 2 : Pengurangan
            case '-' :
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + "=" + hasil);
                break;
            //case 3 : Perkalian
            case '*' :
                hasil = angka1 * angka2;
                System.out.println(angka1 + "*" + angka2 + "=" + hasil);
                break;
            //case 4 : Pembagian
            case '/' :
                hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil);
                break;
            default:
                break;
        }
    }
}
