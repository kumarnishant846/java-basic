package Basics_java;
/*
public class main {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void create() {
        for (int i = 1; i <= 5; i++) {
            Node newNode = new Node(i * 10);

            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
    }

    void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node previous = tail;

        do {
            if (current.data == data) {

                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    previous.next = current.next;

                    if (current == tail) {
                        tail = previous;
                    }
                }

                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println("Node not found");
    }

    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {

        main list = new main();

        list.create();

        System.out.println("Original Circular Linked List:");
        list.traverse();

        list.insertBeginning(5);

        System.out.println("After inserting 5 at beginning:");
        list.traverse();

        list.delete(30);

        System.out.println("After deleting 30:");
        list.traverse();
    }
}

 */
/*
public class main {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void create() {
        for (int i = 1; i <= 5; i++) {
            Node newNode = new Node(i * 10);

            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
    }

    void insertBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {

        main list = new main();

        list.create();

        System.out.println("Original List:");
        list.traverse();

        list.insertBeginning(5);

        System.out.println("After inserting at beginning:");
        list.traverse();

        list.insertEnd(60);

        System.out.println("After inserting at end:");
        list.traverse();

        
    }
}

 */

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 1, 6, 7};
        int target = 7;

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Pair: " + arr[i] + " + " + arr[j]);
                break;
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }
    }
}