public class Main15 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi15 list = new DaftarMahasiswaBerprestasi15();
        Mahasiswa15 m1 = new Mahasiswa15("Nusa", 2017, 25, 3);
        Mahasiswa15 m2 = new Mahasiswa15("Rara", 2012, 19, 4);
        Mahasiswa15 m3 = new Mahasiswa15("Dompu", 2018, 19, 3.5);
        Mahasiswa15 m4 = new Mahasiswa15("Abdul", 2017, 23, 2);
        Mahasiswa15 m5 = new Mahasiswa15("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("\nData mahasiswa sebelum sorting : \n");
        list.tampil();

        System.out.println("\nData mahasiswa setelah bubble sorting desc berdasarkan ipk     : \n");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah selection sorting asc berdasarkan ipk   : \n");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah insertion sorting asc berdasarkan ipk   : \n");
        list.insertionSort();
        list.tampil();
    }
}