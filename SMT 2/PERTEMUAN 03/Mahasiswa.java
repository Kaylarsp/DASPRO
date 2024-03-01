public class Mahasiswa {
    public String nama;
    public String nim;
    public String gender;
    public double ipk;
    public static double avgIpk;

    public Mahasiswa() {
        avgIpk = 0;
    }

    public static void calculateAvg(Mahasiswa[] dataMhs) {
        double totalIpk = 0;
        for (int i = 0; i < dataMhs.length; i++) {
            totalIpk += dataMhs[i].ipk;
        }
        avgIpk = totalIpk / dataMhs.length;
    }
}
