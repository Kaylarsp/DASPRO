public class SLLMain15 {
    public static void main(String[] args) {
        LinkedList15 myLinkedList = new LinkedList15();
        System.out.println();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();

        // percobaan 2
        System.out.println("\nData pada index ke-1          : " + myLinkedList.getData(1));
        System.out.println("Data 300 berada pada index ke : " + myLinkedList.indexOf(300));

        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();

        myLinkedList.insertBefore(800, 450);
        myLinkedList.print();
        myLinkedList.insertAt(1, 400);
        myLinkedList.print();
        myLinkedList.removeAt(1);
        myLinkedList.print();
    }
}
