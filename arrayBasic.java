import java.util.Scanner;

public class arrayBasic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();
        
        if (n < 1) {
            System.out.println("Error: Array must have at least 1 elements.");
        } else {
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println("The array is: ");
            for(int i=0;i<n;i++){
                
                System.out.print(arr[i]+" ");
            }
            
        }
        
        scn.close();
    }
}

