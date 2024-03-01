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
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPersegi panjang ke-" + (i + 1) + ", Panjang : " + arrayOfPersegiPanjang[i].panjang + ", Lebar   : " + arrayOfPersegiPanjang[i].lebar);
        }
    }
}