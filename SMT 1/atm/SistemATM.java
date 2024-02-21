import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemATM {

    private Map<String, Double> saldoAkun;
    private String nomorRekeningSaatIni;
    private Scanner scanner;
    private static final int PASSWORD = 123;

    public SistemATM() {
        saldoAkun = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void jalankan() {
        while (true) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    buatAkun();
                    break;
                case 2:
                    masukkanNomorRekening();
                    break;
                case 3:
                    tampilkanSaldo();
                    break;
                case 4:
                    setor();
                    break;
                case 5:
                    tarik();
                    break;
                case 6:
                    keluar();
                    break;
                case 7:
                    cekBungaTabungan();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private void tampilkanMenu() {
        System.out.println("\n===== Menu Sistem ATM =====");
        System.out.println("1. Buat Akun");
        System.out.println("2. Masukkan Nomor Rekening");
        System.out.println("3. Tampilkan Saldo");
        System.out.println("4. Setor Tunai");
        System.out.println("5. Tarik Tunai");
        System.out.println("6. Keluar");
        System.out.println("7. Cek Bunga Tabungan");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private double readDoubleInput(String prompt) {
        double result = 0;
        boolean isValidInput = false;
    
        do {
            try {
                System.out.print(prompt);
                result = scanner.nextDouble();
                isValidInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next(); // consume the invalid input
            }
        } while (!isValidInput);
    
        return result;
    }
    
    private void buatAkun() {
        do {
            System.out.print("Masukkan nomor rekening: ");
            String nomorRekening = scanner.nextLine();
    
            if (saldoAkun.containsKey(nomorRekening)) {
                System.out.println("Akun sudah ada dengan nomor rekening tersebut.");
            } else {
                double saldoAwal = readDoubleInput("Masukkan saldo awal: ");
                saldoAkun.put(nomorRekening, saldoAwal);
                System.out.println("Akun berhasil dibuat.");
            }
    
            // Consume the newline character in the buffer
            scanner.nextLine();
    
            System.out.println();
            System.out.print("Kembali ke menu? (y/n): ");
            String confirm = scanner.next();
    
            if (confirm.equalsIgnoreCase("y")) {
                tampilkanMenu();
            } else {
                keluar();
            }
        } while (true); // Replace with a meaningful condition based on your program logic
    }
    
    private void masukkanNomorRekening() {
        boolean akunDitemukan = false;
    
        do {
            System.out.print("Masukkan nomor rekening: ");
            String nomorRekening = scanner.nextLine();
    
            if (saldoAkun.containsKey(nomorRekening)) {
                nomorRekeningSaatIni = nomorRekening;
                System.out.println("Berhasil login.");
                akunDitemukan = true;
            } else {
                System.out.println("Akun tidak ditemukan. Silakan buat akun terlebih dahulu.");
                System.out.print("Coba lagi? (y/n): ");
                String confirm = scanner.next();
    
                if (!confirm.equalsIgnoreCase("y")) {
                    break; // Exit the loop if the user doesn't want to try again
                }
            }
        } while (!akunDitemukan);
    }
    
    private void tampilkanSaldo() {
        if (nomorRekeningSaatIni != null) {
            System.out.println("Saldo: Rp" + saldoAkun.get(nomorRekeningSaatIni));
        } else {
            System.out.println("Silakan masukkan nomor rekening terlebih dahulu.");
        }
    }

    private void setor() {
        if (nomorRekeningSaatIni != null) {
            System.out.print("Masukkan jumlah setoran: Rp");
            double jumlahSetoran = scanner.nextDouble();
            saldoAkun.put(nomorRekeningSaatIni, saldoAkun.get(nomorRekeningSaatIni) + jumlahSetoran);
            System.out.println("Setoran berhasil. Saldo baru: Rp" + saldoAkun.get(nomorRekeningSaatIni));
        } else {
            System.out.println("Silakan masukkan nomor rekening terlebih dahulu.");
        }
    }


    private void tarik() {
        if (nomorRekeningSaatIni != null) {
            System.out.print("Masukkan jumlah penarikan: Rp");
            double jumlahPenarikan = scanner.nextDouble();
            double saldoSaatIni = saldoAkun.get(nomorRekeningSaatIni);

            if (jumlahPenarikan <= saldoSaatIni) {
                saldoAkun.put(nomorRekeningSaatIni, saldoSaatIni - jumlahPenarikan);
                System.out.println("Penarikan berhasil. Saldo baru: Rp" + saldoAkun.get(nomorRekeningSaatIni));
            } else {
                System.out.println("Saldo tidak mencukupi.");
            }
        } else {
            System.out.println("Silakan masukkan nomor rekening terlebih dahulu.");
        }
    }

    private void keluar() {
        System.out.println("Keluar dari sistem ATM. Terima kasih!");
        System.exit(0);
    }

    private void cekBungaTabungan() {
        System.out.print("\nMasukkan Jumlah Tabungan Awal Anda: Rp.");
        int jumlahTabunganAwal = scanner.nextInt();

        System.out.print("\nMasukkan Lama Menabung Anda (bulan): ");
        int lamaTabungan = scanner.nextInt();

        double prosentaseBunga = 0.02;
        double bunga = lamaTabungan * prosentaseBunga * jumlahTabunganAwal;
        double jumlahTabunganAkhir = bunga + jumlahTabunganAwal;

        System.out.println("\n-----PENGECEKAN BUNGA TABUNGAN BERHASIL-----");
        System.out.println("Jumlah Tabungan Akhir Anda Adalah Senilai : Rp." + jumlahTabunganAkhir + "\n");
    }

    public static void main(String[] args) {
        SistemATM sistemATM = new SistemATM();
        sistemATM.jalankan();
    }
}