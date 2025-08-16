import java.util.Scanner;

public class swapInArray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();
        if (n < 1) {
            System.out.println("Error..there should atleast 1 element in the array");
        } 
        else {
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println("print the 2 index you want to swap values");
            int a=scn.nextInt();
            int b=scn.nextInt();
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            System.out.print("After swappping the array is:");
            for(int i=0;i<n;i++){
                
                System.out.print(arr[i]+" ");
            }
            scn.close();
        }
    }
}