import java.util.Scanner;
public class sumOfArrray {
   public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=scn.nextInt();
    int[] arr=new int[n];
    int sum=0;
    System.out.println("Enter "+n+" elements");
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    System.out.println("The sum of all elements is: "+sum);
    scn.close();
   } 
}
