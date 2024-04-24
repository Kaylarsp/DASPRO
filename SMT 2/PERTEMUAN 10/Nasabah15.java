public class Nasabah15 {
    String norek, nama, alamat;
    int umur;
    double saldo;

    Nasabah15(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    Nasabah15[] data;
    int front;
    int rear;
    int size;
    int max;

    Nasabah15() {}
}