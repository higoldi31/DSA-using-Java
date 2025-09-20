package BinarySearch;
//search the given target in the  sorted array 
//if not found then return the index where it could be inserted maintaining the order of the array
public class InsertPosition {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,8,11,13,16,18,22,27};
        // int target=22;
        int target=23;
        System.out.println(insertPosition(arr,target));
    }
    public static int insertPosition(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    
}
