public class LinkedList15 {
    Node15 head; // head : penunjuk paling depan

    public boolean isEmpty() {
        return (head == null); // mengembalikan nilai true klo head kosong, dan false klo dia udh keisi
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node15 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        Node15 newNode = new Node15(input, null); // bikin node baru

        if (isEmpty()) {
            head = newNode; // klo list kosong, node baru jd node pertama dlm list
        } else { // klo g kosong, node baru ditambah ke awal list
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node15 newNode = new Node15(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node15 currentNode = head;
            // perulangan utk mencari node trakhir dlm list
            while (currentNode.next != null) { // perulangan bru berhenti pas currentNode.next nya null, yg artinya dia udh di posisi trahir
                currentNode = currentNode.next;
            }

            currentNode.next = newNode; // di sini, node barunya jd ada di posisi akhir
        }
    }

    public void insertAfter(int key, int input) {
        Node15 newNode = new Node15(input, null);

        if (!isEmpty()) {
            Node15 currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // percobaan 2
    public int getData(int index) {
        Node15 currentNode = head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        // for (int i = 0; i < index; i++) {
        //     currentNode = currentNode.next;
        // }
        return currentNode.data;
    }

    public int indexOf(int key) {
        Node15 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node15 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();;
        } else {
            Node15 currentNode = head;
    
            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    // a. insertBefore() method
    public void insertBefore(int key, int input) {
        Node15 newNode = new Node15(input, null);

        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        if (head.data == key) {
            addFirst(input);
            return;
        }
        // Traverse
        Node15 currentNode = head;
        while (currentNode.next != null && currentNode.next.data != key) {
            currentNode = currentNode.next;
        }
        if (currentNode.next == null) {
            System.out.println("Keyword " + key + " tidak ditemukan");
            return;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // b. insertAt(int index, int key) method
    public void insertAt(int index, int input) {
        Node15 newNode = new Node15(input, null);
    
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
    
        if (index == 0) {
            addFirst(input);
        } else {
            Node15 currentNode = head;
            int currentIndex = 0;
    
            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }
    
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
            }
    
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    // c. removeAt(int index) method
    public void removeAt(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
    
        if (index == 0) {
            removeFirst();
        } else {
            Node15 currentNode = head;
            int currentIndex = 0;
    
            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }
    
            if (currentNode == null || currentNode.next == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
            }
    
            currentNode.next = currentNode.next.next;
        }
    }
}