public class persegiPanjang15 {
    public int panjang;
    public int lebar;

    public persegiPanjang15() {

    }

    public persegiPanjang15(int p, int l) {
        panjang = p;
        lebar = l;
    }

    // mengakses isi array arrayOfPersegiPanjang dan menampilkannya
    public void cetakInfo(persegiPanjang15[] arrayOfPersegiPanjang) {
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            int luas = hitungLuas(arrayOfPersegiPanjang[i].panjang, arrayOfPersegiPanjang[i].lebar);
            int keliling = hitungKeliling(arrayOfPersegiPanjang[i].panjang, arrayOfPersegiPanjang[i].lebar);
            System.out.println("\nPersegi panjang ke-" + (i + 1)
                                + ", Panjang : " + arrayOfPersegiPanjang[i].panjang
                                + ", Lebar   : " + arrayOfPersegiPanjang[i].lebar
                                + ", Luas : " + luas + ", Keliling : " + keliling
            );
        }
    }

    // menambahkan method untuk menghitung luas
    public int hitungLuas(int p, int l) {
        int luas = 0;
        luas = p * l;
        return luas;
    }

    // menambahkan method untuk menghitung keliling
    public int hitungKeliling(int p, int l) {
        int keliling = 0;
        keliling = 2 * (p + l);
        return keliling;
    }
}