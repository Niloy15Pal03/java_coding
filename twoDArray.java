import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter row:");
        int n=scn.nextInt();
        System.out.print("Enter cloumn:");
        int m=scn.nextInt();
        int[][] arr= new int[n][m];
        System.out.println("Your default array is:");
        System.out.println("Your 2d array is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter values:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("Your 2d array is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scn.close();
    }
}
