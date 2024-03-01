import java.util.Scanner;;

public class atm {
    public int pin;
    public String rekening;
    public int saldo = 100000;
    
    public atm() {}
    public atm(int p, String rek, int s) {
        pin = p;
        rekening = rek;
        saldo = s;
    }
    
    public static void login(int pin) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan pin : ");
        pin = sc.nextInt();
        tampilkanMenu();
    }

    public static void tampilkanMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Pilih menu : ");
        int menu = sc.nextInt();
        System.out.println("1. CEK SALDO");
        System.out.println("2. TARIK TUNAI");
        System.out.println("3. SETOR TUNAI");
        System.out.println("4. TRANSFER SALDO");
        switch (menu) {
            case 1:
                cekSaldo(menu);
                break;
            case 2:
                tarikTunai(menu, menu);;
                break;
            case 3:
                setorTunai(menu, menu);;
                break;
            case 4:
                transferSaldo(menu, menu);;
                break;
            default:
                break;
        }
    }

    public static void cekSaldo(int saldo) {
        System.out.print("Saldo anda : " + saldo);
    }

    public static void tarikTunai(int jumlah, int saldo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nominal tarik tunai : ");
        jumlah = sc.nextInt();
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo anda tidak cukup");
        }
    }

    public static void setorTunai(int setor, int saldo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nominal setor tunai");
        setor = sc.nextInt();
        saldo += setor;
    }

    public static void transferSaldo(int tf, int saldo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nominal trasnfer : ");
        tf = sc.nextInt();
        if (tf <= saldo) {
            saldo -= tf;
        } else {
            System.out.println("Saldo anda tidak cukup");
        }
    }
}
