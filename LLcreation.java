import java.util.Scanner;
class node{
    int val;
    node next;

    node(int v1){
        this.val=v1;
        this.next=null;
    }
}
public class LLcreation{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=scn.nextInt();
        node head=null;
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1)+":");
            node newnode=new node(scn.nextInt());
            if(head==null){
                head=newnode;
            }else{
                node current=head;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newnode;
            }
        }
        node current=head;
        System.out.println("Linked List:");
        while(current!=null){
            System.out.println(current.val+" ");
            current=current.next;
        }
        scn.close();
    }
}