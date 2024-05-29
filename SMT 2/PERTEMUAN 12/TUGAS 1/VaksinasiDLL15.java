public class VaksinasiDLL15 {
    NodeVaksin15 head;
    int size;

    public VaksinasiDLL15(){
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Vaksinasi15 item) {
        if (isEmpty()) {
            head = new NodeVaksin15(null, item, null);
        } else {
            NodeVaksin15 newNode = new NodeVaksin15(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Vaksinasi15 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeVaksin15 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeVaksin15 newNode = new NodeVaksin15(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Vaksinasi15 item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else{
            NodeVaksin15 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeVaksin15 newNode = new NodeVaksin15(null, item, current);
                newNode.prev = newNode;
                head = newNode;
            } else {
                NodeVaksin15 newNode = new NodeVaksin15(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        } size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeVaksin15 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data.noAntri + " - " + tmp.data.nama + "\n");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeVaksin15 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeVaksin15 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Vaksinasi15 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public Vaksinasi15 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        NodeVaksin15 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Vaksinasi15 get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        NodeVaksin15 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}