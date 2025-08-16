import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class insertAtFirst {

    static Node insertAtStart(Node head, int v) {
        Node n1 = new Node(v);
        n1.next = head;
        return n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        Node head = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.print("\nEnter the value of the node to insert at the start: ");
        int v = sc.nextInt();
        head = insertAtStart(head, v);

        current = head;
        System.out.print("Updated Linked List: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        sc.close();
    }
}
