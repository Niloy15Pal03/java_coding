import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();
        if (n < 1) {
            System.out.println("Error..there should atleast 1 element in the array");
        } else {
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max || arr[i] == max) {
                    max = arr[i];
                }
            }
            System.out.println("The maximum of all elements is: " + max);
        }
        scn.close();
    }
}
