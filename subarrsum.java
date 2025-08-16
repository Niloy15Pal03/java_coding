public class subarrsum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
         boolean ans=sas(arr, 77, 0, 0);
        if (ans){
            System.out.println("yes there is a subarray");
        }else{
            System.out.println("try again");
        }
    }
    public static boolean sas(int[] arr, int sum,int tempsum,int i){
        if(sum==tempsum){
            return true;
        }
        if(i>=arr.length){
            return false;
        }
        boolean recall1=sas(arr,sum,tempsum+arr[i],i+1);
        boolean recall2=sas(arr,sum,tempsum,i+1);
        return recall1||recall2;
    }

}
