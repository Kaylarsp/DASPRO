import java.util.Scanner;

public class tugas215 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menuLoop();
    }

    static void displayMenu() {
        System.out.println();
        System.out.println("--------------------");
        System.out.println("|       MENU       |");
        System.out.println("--------------------");
        System.out.println("| 1 |   Kecepatan  |");
        System.out.println("| 2 |     Jarak    |");
        System.out.println("| 3 |     Waktu    |");
        System.out.println("--------------------");
        System.out.println();
    }

    static void menuLoop() {
        int menu;

        do {
            displayMenu();
            System.out.print("Silahkan pilih menu : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    kecepatan();
                    break;
                case 2:
                    jarak();
                    break;
                case 3:
                    waktu();;
                    break;
                default:
                    System.out.println("Invalid menu");
            }
            // konfirmasi
            System.out.println();
            System.out.print("Kembali ke menu? (y/t) : ");
            String confirm = sc.next();
            if (confirm.equalsIgnoreCase("y")) {
                menuLoop();
            } else {
                System.exit(0);
            }
        } while (true);
    }

    static void kecepatan() {
        System.out.println();
        System.out.print("Masukkan jarak (m) : ");
        int s = sc.nextInt();
        System.out.print("Masukkan waktu (s) : ");
        int t = sc.nextInt();
        double v = s / t;
        System.out.println("Kecepatan          : " + v + " m/s");
    }

    static void jarak() {
        System.out.println();
        System.out.print("Masukkan kecepatan (m/s) : ");
        int v = sc.nextInt();
        System.out.print("Masukkan waktu (s)       : ");
        int t = sc.nextInt();
        double s = v * t;
        System.out.println("Jarak yang ditempuh      : " + s + " m");
    }

    static void waktu() {
        System.out.println();
        System.out.print("Masukkan kecepatan (m/s) : ");
        int v = sc.nextInt();
        System.out.print("Masukkan jarak (m)       : ");
        int s = sc.nextInt();
        double t = s / v;
        System.out.println("Waktu yang dibutuhkan  : " + t + " s");
    }
}
