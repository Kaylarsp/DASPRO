public class item15 {
    public String name;
    public double price;
    public int stock;

    

    public void displayInfo() {
        System.out.println();
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price);
        System.out.println("Stock : " + stock);
    }
}

class canteenDemo {
    public static void main(String[] args) {
        item15 item1 = new item15();
        item1.name = "Waffle";
        item1.price = 25000;
        item1.stock = 30;
        
        item15 item2 = new item15();
        item2.name = "Pancake";
        item2.price = 35000;
        item2.stock = 35;

        item15 item3 = new item15();
        item3.name = "Croissant";
        item3.price = 35000;
        item3.stock = 15;

        item1.displayInfo();
        item2.displayInfo();
        item3.displayInfo();
    }
}
