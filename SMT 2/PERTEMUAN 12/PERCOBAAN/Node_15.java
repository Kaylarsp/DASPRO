public class Node_15 {
    int data;
    Node_15 prev, next;

    Node_15(Node_15 prev, int data, Node_15 next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}