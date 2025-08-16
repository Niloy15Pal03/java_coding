import java.util.ArrayList;
public class subarr {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer> temparr=new ArrayList<>();
        sa(arr,temparr,0);
    }
    private static void sa(int[] arr, ArrayList<Integer> temparr, int i) {
        if(arr.length==i){
            System.out.println(temparr);
            return;
        }
        temparr.add(arr[i]);
        sa(arr, temparr, i+1);
        temparr.remove(temparr.size()-1);
        sa(arr, temparr, i+1);
        return;
    }

}
