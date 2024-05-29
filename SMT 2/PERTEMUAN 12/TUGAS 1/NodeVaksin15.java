public class NodeVaksin15 {
    Vaksinasi15 data;
    NodeVaksin15 prev, next;

    NodeVaksin15(NodeVaksin15 prev, Vaksinasi15 data, NodeVaksin15 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}