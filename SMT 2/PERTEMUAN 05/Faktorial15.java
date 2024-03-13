public class Faktorial15 {
    public int nilai;
    public Faktorial15() {}
    // menghitung faktorial dari n dengan cara mengalikan n dengan semua bilangan positif dari 1 hingga n
    public int faktorialBF(int n) {
        int fakto = 1; // dideklarasikan dengan nilai 1 krn faktorial dr 0 adlh 1, dan perkalian akan dimulai dr angka tsb
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }
    
    // memecah masalah menjadi masalah" yg lebih kecil, kemudian menyelesaikan masalah" tsb secara rekursif
    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
