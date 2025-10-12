package Array;
//given a sorted integer array,square each element and return the array in sorted order
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SquareOfNumbers {
    public static void main(String[] args) {
        int[] nums={-1,-2,-4,0,1,4};
        int[] res=squareOfSortedArray(nums);
        System.out.println(Arrays.toString(res));
        
    }
    public static int[] squareOfSortedArray(int[] nums){
        ArrayList<Integer> list=new ArrayList<>();
        for(int item:nums){
            list.add(item*item);

        }
        Collections.sort(list);
        int[] res=list.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
    
}
