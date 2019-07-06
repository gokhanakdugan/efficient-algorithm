import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class UniqueTwoSum {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7,1,2,3,4,5,6,7,0};
        int target = 5;

       System.out.println(uniqueTwoSum(arr,target));
    }

public static ArrayList<Integer> uniqueTwoSum(int[] arr, int target){
    if (arr == null || arr.length < 2){
        throw new IllegalArgumentException();
    }
    
    HashSet set = new HashSet<>();
    ArrayList<Integer> list = new ArrayList<>();
    
    for (int i = 0 ; i < arr.length ; i++){
        if (!set.contains(arr[i])){
            if (!set.contains(target-arr[i])){
                set.add(target-arr[i]);
            }
        } 
            
        else{
            if (!list.contains(arr[i]) || !list.contains(target-arr[i])){
            list.add(arr[i]);
            list.add(target-arr[i]);
            
            }
        }
    }
    return list; 
    }
}
