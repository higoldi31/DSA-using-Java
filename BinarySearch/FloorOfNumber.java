package BinarySearch;
//find the floor of the given target in the sorted array
//return -1 if not found
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,9,11,14,19,20,25,32,47};
        // int target=17;        //14
        // int target=12;           //11
        int target=1;
        
        System.out.println(findFloor(arr,target));
    }
    public static int findFloor(int[] arr,int target){
        if(target<arr[0]){
            return -1;
        }
        int l=0;
        int r=arr.length-1;
        int res=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target<arr[mid]){
                r=mid-1;
            }else if(target>arr[mid]){
                res=mid;  //potential floor
                l=mid+1;

            }
        }
        return arr[res];
    }
    
}
