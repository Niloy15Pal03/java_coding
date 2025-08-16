public class fact_rec {

    public static void main(String[] args) {
        int ans= fact(5);
        System.out.println(ans);
    }
    public static int fact(int N){
        if (N==1){
            return 1;
        }
        int temp = fact (N-1);
        return temp*N;
    }
} 