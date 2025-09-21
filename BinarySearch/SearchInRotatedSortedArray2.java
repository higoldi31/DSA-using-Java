package BinarySearch;
//check if the given target is present  in the rotated sorted array containing duplicates
public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        // int[] arr={7,8,11,14,19,19,19,21,1,2,3,4,6};
        // int target=19;
        int[] arr={2,5,6,0,0,1,2};
        int target=0;
        System.out.println(searchTarget(arr,target));

        
    }
    public static boolean searchTarget(int[] arr,int target){
        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[l]==arr[mid]&&arr[r]==arr[mid]){
                l++;
                r--;
            }else if(arr[l]<=arr[mid]){//left sorted array
                if(target>=arr[mid]&&target<arr[mid]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{//right sorted array
                if(target<=arr[r]&&target>arr[mid]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return false;
    }
}
