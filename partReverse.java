import java.util.Scanner;
public class partReverse {
    
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
            System.out.println("Enter the starting index for reversing:");
            int sp=scn.nextInt();
            System.out.println("Enter the ending index for reversing:");
            int ep=scn.nextInt();
            reverse(arr,sp,ep);
            
           
            System.out.print("After swappping the array is:");
            for(int i=0;i<n;i++){
                
                System.out.print(arr[i]+" ");
            }
            scn.close();
        }
    }
    public static void reverse(int arr[],int a,int b){
        int sp=a;
        int ep=b;
        while(sp<ep){
         int temp=arr[sp];
         arr[sp]=arr[ep];
         arr[ep]=temp;
         sp++;
         ep--;
        }
    }
}


