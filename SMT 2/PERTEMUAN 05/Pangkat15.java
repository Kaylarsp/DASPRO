public class Pangkat15 {
    public int nilai, pangkat;

    // menambahkan konstruktor untuk pertanyaan no.4
    public Pangkat15(int nil, int pgkt) {
        nilai = nil;
        pangkat = pgkt;
    }

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }
    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) { // bilangan ganjil
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
            } else { // bilangan genap
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}