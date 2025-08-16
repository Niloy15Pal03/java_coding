import java.util.Scanner;

public class swapArrayReverse {
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
           int sp=0;
           int ep=arr.length-1;
           while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
           }
            System.out.print("After swappping the array is:");
            for(int i=0;i<n;i++){
                
                System.out.print(arr[i]+" ");
            }
            scn.close();
        }
    }
}
