public class powr {
    public static void main(String[] args) {
        int ans= pow(2,4);
        int ans2= bpow(2,5);
        System.out.println(ans);
        System.out.println(ans2);
    }
    public static int pow(int a , int n){
        if(n==0){
            return 1;
        }
        int temp=pow(a,n-1);
        return temp*a;
    }
    public static int bpow(int a, int n){
        if(n==0){
            return 1;
        }
        int temp= bpow(a,n/2);
        if(n%2==0){
            return (temp*temp);
        }
        else{return(temp*temp*a);}
    }
}
