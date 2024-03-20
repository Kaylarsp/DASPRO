public class HotelService15 {
    Hotel15 rooms[] = new Hotel15[5];
    int idx;

    void tambah(Hotel15 h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        System.out.println("Nama : ");
    }
    void bubbleSort() {}
    void selectionSort() {}


}
