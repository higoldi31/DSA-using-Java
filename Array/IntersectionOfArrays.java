package Array;
//find the intersection of two array i.e common elements
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1={2,4,1,8,6};
        int[] arr2={4,9,1};
        int[] res=findIntersection(arr1,arr2); //[4,1]
        System.out.println(Arrays.toString(res));
    }
    public static int[] findIntersection(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> resultSet=new HashSet<>();

        for(int items:arr1){
            set.add(items);
        }

        for(int items:arr2){
            if(set.contains(items)){
                resultSet.add(items);
            }
        }
        int[] result=new int[resultSet.size()];
        int index=0;
        for(int items:resultSet){
            result[index++]=items;
        }
        return result;
    }
}
