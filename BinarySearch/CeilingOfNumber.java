package BinarySearch;
//find the ceil of the given target in the sorted array
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,9,11,13,14,17,18,23};
        int target=12;                          //13
        System.out.println(findCeil(arr,target));
        
    }
    public static int findCeil(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        int res=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target<arr[mid]){
                res=mid;    //potential ceil
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return arr[res];
    }
    
}
