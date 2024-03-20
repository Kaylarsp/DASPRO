public class MainHotel15 {
    public static void main(String[] args) {
        HotelService15 list = new HotelService15();
        Hotel15 h1 = new Hotel15("Grand A", "Malang", 95000, (byte)2);
        Hotel15 h2 = new Hotel15("Grand B", "Surabaya", 175000, (byte)4);
        Hotel15 h3 = new Hotel15("Grand C", "Jakarta", 250000, (byte)5);
        Hotel15 h4 = new Hotel15("Grand D", "Bandung", 100000, (byte)3);
        Hotel15 h5 = new Hotel15("Grand E", "Jogja", 90000, (byte)1);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("\n------------------------------------------------");
        System.out.println("|                 Daftar hotel                 |");
        System.out.println("------------------------------------------------");
        list.tampilAll();
        
        System.out.println("|   Daftar hotel dengan urutan harga termurah  |");
        System.out.println("------------------------------------------------");
        list.bubbleSort();
        list.tampilAll();
        
        System.out.println("| Daftar hotel dengan urutan bintang tertinggi |");
        System.out.println("------------------------------------------------");
        list.selectionSort();
        list.tampilAll();
    }
}