public class palR {
    public static void main(String[] args) {
        String str="madam";
        boolean ans = ispal(str.toCharArray(),0,str.length()-1);
        if (ans){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
    public static boolean ispal(char ch[],int s,int e){
        if (s==e||s>e){return true;}
        if (ch[s]==ch[e]){
            boolean temp=ispal(ch,s+1,e-1);
            return temp;
        }
        else{return false;}
    }
}
