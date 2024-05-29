public class DoubleLinkedLists15 {
    Node15 head;
    int size;

    public DoubleLinkedLists15(){
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film15 item) {
        if (isEmpty()) {
            head = new Node15(null, item, null);
        } else {
            Node15 newNode = new Node15(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film15 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node15 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node15 newNode = new Node15(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film15 item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else{
            Node15 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node15 newNode = new Node15(null, item, current);
                newNode.prev = newNode;
                head = newNode;
            } else {
                Node15 newNode = new Node15(current.prev, item, current);
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
            Node15 tmp = head;
            System.out.println("Cetak Data");
            while (tmp != null) {
                System.out.println("ID     : " + tmp.data.id);
                System.out.println("Judul  : " + tmp.data.judul);
                System.out.println("Rating : " + tmp.data.rating);
                tmp = tmp.next;
            }
            // System.out.println("\nberhasil diisi");
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
        Node15 current = head;
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
            Node15 current = head;
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

    public Film15 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public Film15 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node15 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film15 get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node15 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film15 searchById(int id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong");
        }

        Node15 current = head;
        while (current != null) {
            if (current.data.id == id) {
                return current.data;
            }
            current = current.next;
        }

        throw new Exception("Film dengan ID " + id + " tidak ditemukan");
    }

    public void sortByRatingDesc() {
        if (isEmpty() || size == 1) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            Node15 current = head;
            Node15 maxNode = current;

            for (int j = 0; j < size - i - 1; j++) {
                if (current.next != null && current.next.data.rating > maxNode.data.rating) {
                    maxNode = current.next;
                }
                current = current.next;
            }

            if (maxNode != current) {
                Film15 temp = current.data;
                current.data = maxNode.data;
                maxNode.data = temp;
            }
        }
    }
}