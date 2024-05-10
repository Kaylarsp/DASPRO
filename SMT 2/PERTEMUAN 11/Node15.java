public class Node15 {
    int data;
    Node15 prev, next;

    Node15(Node15 prev, int data, Node15 next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}