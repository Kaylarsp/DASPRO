import java.util.Scanner;

public class atm {
    private int pin;
    private String rekening;
    private int saldo = 100000;

    public atm() {}

    public atm(int p, String rek) {
        pin = p;
        rekening = rek;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan pin : ");
        int inputPin = sc.nextInt();
        if (inputPin == pin) {
            tampilkanMenu();
        } else {
            System.out.println("Pin salah, silakan coba lagi.");
            login();
        }
    }

    public void tampilkanMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("-------------------");
        System.out.println("\tMENU\t");
        System.out.println("-------------------");
        System.out.println("1. CEK SALDO");
        System.out.println("2. TARIK TUNAI");
        System.out.println("3. SETOR TUNAI");
        System.out.println("4. TRANSFER SALDO");
        System.out.println("-------------------");
        System.out.print("\nPilih menu : ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                cekSaldo();
                break;
            case 2:
                tarikTunai();
                break;
            case 3:
                setorTunai();
                break;
            case 4:
                transferSaldo();
                break;
            default:
                break;
        }
    }

    public void cekSaldo() {
        System.out.println();
        System.out.println("Saldo anda : " + saldo);
    }

    public void tarikTunai() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nominal tarik tunai : ");
        int jumlah = sc.nextInt();
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Transaksi berhasil.");
        } else {
            System.out.println("Saldo anda tidak cukup.");
        }
    }

    public void setorTunai() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nominal setor tunai : ");
        int jumlah = sc.nextInt();
        saldo += jumlah;
        System.out.println("Transaksi berhasil.");
    }

    public void transferSaldo() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nominal trasnfer : ");
        int jumlah = sc.nextInt();
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Transaksi berhasil.");
        } else {
            System.out.println("Saldo anda tidak cukup.");
        }
    }
}