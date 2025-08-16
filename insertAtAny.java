import java.util.Scanner;

class node {
    int val;
    node next;

    node(int v1) {
        this.val = v1;
        this.next = null;
    }
}

public class insertAtAny {
    static node insertAtany(node head, int v, int k) {
        node n1 = new node(v);

        if (k == 1) { 
            n1.next = head;
            return n1;
        }

        node temp = head;
        for (int i = 1; i <k - 1; i++) {
            temp = temp.next;
        }

        n1.next = temp.next;
        temp.next = n1;

        return head;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int n = scn.nextInt();
        node head = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            node newnode = new node(scn.nextInt());

            if (head == null) {
                head = newnode;
            } else {
                node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newnode;
            }
        }

        node current = head;
        System.out.println("Linked list:");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println("\nEnter the value to insert:");
        int v = scn.nextInt();
        System.out.println("Enter the position at which you want to insert:");
        int k = scn.nextInt();
        head = insertAtany(head, v, k);

        current = head;
        System.out.print("Updated Linked List: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        scn.close();
    }
}
