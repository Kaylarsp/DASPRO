import java.util.Scanner;
public class DLL1 {
    static class Node {
        int data;
        Node prev, next;
        Node(int data) {
        this.data = data;
        }
    }

        Node head, tail;
        boolean isEmpty() {
        return head == null;
        }

        void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) tail = newNode;
        else {
        newNode. next = head;
        head. prev = newNode;
        }
        head = newNode;
        System. out. println("Successfully added data to linked list");
    }
        void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) head = newNode;
        else {
        tail.next = newNode;
        newNode.prev = tail;
        }
        tail = newNode;
        System. out. println("Successfully added data to linked list");
    }

        void remove(int key) {
        if (isEmpty()) {
        System. out. println("Linked List is empty");
        return;
        }
        Node current = head;
        while (current != null && current.data != key) {
        current = current.next;
        }
        if (current == null) {
        System. out. println("Data not found");
        return;
        }
        if (current == head) {
        head = head.next;
        if (head != null) head.prev = null;
        }
        }