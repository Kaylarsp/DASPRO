import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Mahasiswaa15 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswaa15() {}

    public Mahasiswaa15(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }

    List<Mahasiswaa15> mahasiswaa15s = new ArrayList<>();

    public void tambah(Mahasiswaa15 ... mahasiswa) {
        mahasiswaa15s.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index) {
        mahasiswaa15s. remove(index);
    }
    public void update(int index, Mahasiswaa15 mhs) {
        mahasiswaa15s.set(index, mhs);
    }
    public void tampil() {
        mahasiswaa15s.stream().forEach(mhs -> {
            System.out.println(""+ mhs.toString());
        });
    }

    // int linearSearch(String nim) {
    //     for (int i = 0; i < mahasiswaa15s.size(); i++) {
    //         if (nim.equals(mahasiswaa15s.get(i).nim)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // mengganti linear search dengan binary search
    int binarySearch(String nim) {
        List<String> nims = new ArrayList<>();
        for (Mahasiswaa15 m : mahasiswaa15s) {
            nims.add(m.nim);
        }
        Collections.sort(nims);
        return Collections.binarySearch(nims, nim);
    }

    public void sortAscending() {
        mahasiswaa15s.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortDescending() {
        mahasiswaa15s.sort((m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        Mahasiswaa15 lm = new Mahasiswaa15();
        Mahasiswaa15 m = new Mahasiswaa15("201234", "Noureen", "021xx1");
        Mahasiswaa15 m1 = new Mahasiswaa15("201235", "Akhleema", "021xx2");
        Mahasiswaa15 m2 = new Mahasiswaa15("201236", "Shannum", "021xx3");
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();
        // update mahasiswa
        int index = lm.binarySearch("201235");
        if (index >= 0) {
            lm.update(index, new Mahasiswaa15("201235", "Akhleema Lela", "021xx2"));
        }
        System.out.println("");
        lm.tampil();

        // Sorting ascending
        lm.sortAscending();
        System.out.println("\nSetelah sorting ascending:");
        lm.tampil();

        // Sorting descending
        lm.sortDescending();
        System.out.println("\nSetelah sorting descending:");
        lm.tampil();
    }
}