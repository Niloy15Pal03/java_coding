public class powerSet {
    public static void main(String[] args) {
        String str="abc";
        String str1=" ";
        ps(str,str1,0);
            }
        
            private static void ps(String str, String str1, int i) {
               if(str.length()==i){
                    System.out.println(str1);
                    return;
               }
               ps(str, str1+str.charAt(i), i+1);
               ps(str, str1, i+1);
               
            }
}
