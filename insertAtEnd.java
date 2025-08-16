import java.util.Scanner;

class node {
    int val;
    node next;

    node(int v1) {
        this.val = v1;
        this.next = null;
    }
}

public class insertAtEnd {
    static void insertAtlast(node head, int v) {
        node n1 = new node(v);
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
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
        System.out.println(("Linked list:"));
        while (current != null) {
            System.out.println(current.val + " ");
            current = current.next;
        }
        
        System.out.println("Enter the value to insert at the end:");
        int v = scn.nextInt();
        insertAtlast(head, v);

        current = head;
        System.out.print("Updated Linked List: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        scn.close();
    }
}
