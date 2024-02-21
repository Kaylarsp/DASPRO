import java.util.Scanner;

/**
 * gajikaryawan
 */
public class gajikaryawan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;
        String print, back;

        System.out.println("=== UTS PRAKTIKUM DASAR PEMOGRAMAN SIB-1F===");
        System.out.println("dibuat oleh : Kayla Rachmaudina Satiti Putri");
        System.out.println("NIM : 2341760103");
        System.out.println("============================================");
        System.out.println("");

        do {
            System.out.println("Pilih menu :\n 1. Data Karyawan\n 2. Gaji Karyawan");
            menu = sc.nextInt();
    
            if (menu == 1) {
                System.out.println("Masukkan data karyawan");
                System.out.println("");
                System.out.println("Nama : ");
                String nama = sc.next();
                System.out.println("Alamat : ");
                String alamat = sc.next();
                System.out.println("No.HP : ");
                String hp = sc.next();
                System.out.println("Jumlah penjualan sepeda : ");
                int penjualanSpd = sc.nextInt();
                System.out.println("Masa kerja : ");
                int masaKerja = sc.nextInt();
                System.out.println("Jumlah cuti : ");
                int jmlCuti = sc.nextInt();
                System.out.println("Apakah anda ingin mencetak data karyawan(y/t)? ");
                print = sc.next();
                    if (print.equalsIgnoreCase("y")) {
                        System.out.println("=========================");
                        System.out.println("Data Karyawan");
                        System.out.println("=========================");
                        System.out.println("Nama : " + nama);
                        System.out.println("Alamat : " + alamat);
                        System.out.println("No.HP : " + hp);
                        System.out.println("Jumlah penjualan sepeda : " + penjualanSpd + "sepeda");
                        System.out.println("Masa kerja : " + masaKerja + "tahun");
                        System.out.println("Jumlah cuti : " + jmlCuti + "hari");
                        System.out.println("Kembali ke menu (y/t)?");
                        back = sc.next();
                            if (back.equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Kembali ke menu (y/t)? ");
                            back = sc.next();
                            if (back.equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                break;
                            }
                        }
                    } else if (menu == 2) {
                        System.out.println("========================");
                        System.out.println("Data gaji karyawan ");
                        System.out.println("========================");
                        System.out.println("Nama : ");
                        String nama = sc.next();
                        System.out.println("Komisi Penjualan : ");
                        int komisi = sc.nextInt();
                        System.out.println("Tunjangan :");
                        int tunjangan = sc.nextInt();
                        System.out.println("Potongan gaji : ");
                        int potgaji = sc.nextInt();
                        int gaji;
                        gaji = komisi + tunjangan - potgaji;
                        System.out.println("Gaji yang diterima : " + gaji);
                        System.out.println("Kembali ke menu (y/t)? ");
                        back = sc.next();
                        if (back.equalsIgnoreCase("y")) {
                            continue;
                        } else {
                            break;
                        }
                    }
                } while (true);
        }
    }
    
