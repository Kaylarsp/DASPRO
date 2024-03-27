public class PencarianMhs15 {
    Mahasiswa15 listMhs[] = new Mahasiswa15[5];
    int idx;

    void tambah(Mahasiswa15 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa15 m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        // if (right >= left) {
        //     mid = (left + right) / 2;
        //     if (cari == listMhs[mid].nim) {
        //         return (mid);
        //     } else if (listMhs[mid].nim > cari) {
        //         return FindBinarySearch(cari, left, mid - 1);
        //     } else {
        //         return FindBinarySearch(cari, mid + 1, right);
        //     }
        // }
        // return - 1;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return - 1;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data\t : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data\t : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data\t : " + x + " tidak ditemukan");
        }
    }
}