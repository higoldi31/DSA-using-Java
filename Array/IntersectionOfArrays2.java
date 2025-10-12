package Array;
//find the intersection of two arrays including the number of times the element occurs
import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays2{
    public static void main(String[] args) {
        int[] arr1={1,2,4,4,5,6,7,7,7};
        int[] arr2={2,3,4,7,7};
        int[] res=findIntersection(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findIntersection(int[] arr1,int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> resList=new ArrayList<>();
        for(int item:arr1){
            list.add(item);
        }
        for(int item:arr2){
            if(list.contains(Integer.valueOf(item))){
                resList.add(item);
                list.remove(Integer.valueOf(item));
            }
        }
        int[] result=new int[resList.size()];
        int index=0;
        for(int item:resList){
            result[index++]=item;
        }
        return result;
    }
}
