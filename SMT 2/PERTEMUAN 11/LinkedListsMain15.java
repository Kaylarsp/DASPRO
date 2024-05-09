public class LinkedListsMain15 {
    public static void main(String[] args) throws Exception {
        System.out.println();
        LinkedLists15 dll = new LinkedLists15();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.add(40,1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}