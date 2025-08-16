public class fibor {
   public static void main(String[] args) {
    int ans = fibo(4);
    System.out.println(ans);
   } 
   public static int fibo(int n){
    if(n==1||n==0){
        return n;
    }
    int temp1=fibo(n-1);
    int temp2=fibo(n-2);
    return temp1+temp2;  
   }
}
