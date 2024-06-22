public class LL15 {
    Node015 head;

    public LL15() {
        head = null;
    }

    public void add(Product15 data) {
        Node015 newNode = new Node015(data);
        if (head == null) {
            head = newNode;
        } else {
            Node015 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(String productID) {
        if (head == null) return;

        if (head.data.getProductID().equals(productID)) {
            head = head.next;
            return;
        }

        Node015 current = head;
        while (current.next != null && !current.next.data.getProductID().equals(productID)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public Product15 get(String productID) {
        Node015 current = head;
        while (current != null) {
            if (current.data.getProductID().equals(productID)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void printAll() {
        Node015 current = head;
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("|     %-7s| %-40s | %-15s |", "ID", "Product Name", "Price");
        System.out.println("\n---------------------------------------------------------------------------");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}