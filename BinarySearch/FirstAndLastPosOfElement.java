package BinarySearch;
import java.util.Arrays;
//find the first and last position an element in the sorted array
//if not found, then return[-1,-1]
public class FirstAndLastPosOfElement {        
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,7,7,7,9,11,13,14};
        int target=7;
        // int[] res=findPos(arr, target);
        System.out.println(Arrays.toString(findPos(arr, target)));
        
    }
    public static int[] findPos(int[] arr,int target){
      
        int firstPos=findFirstPos(arr,target);
        int lastPos=findLastPos(arr,target);
        return new int[]{firstPos,lastPos};
    }
    public static int findFirstPos(int[] arr,int target){//binary search for finding left position of the target
        int l=0;
        int r=arr.length-1;
        int firstPos=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                firstPos=mid;
               r=mid-1; 
            }else if(target<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return firstPos;
    }
    public static int findLastPos(int[] arr,int target ){//binary search for fiding the right position of the target
        int l=0;
        int r=arr.length-1;
        int lastPos=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                lastPos=mid;
               r=mid+1; 
            }else if(target<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return lastPos;

    }
    
}
