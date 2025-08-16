public class inc_r {
    public static void main(String[] args) {
        inc(10); 

    }
    public static void inc(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        inc(n-1);
        System.out.println(n);
    }
}
