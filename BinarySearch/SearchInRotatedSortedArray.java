package BinarySearch;
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={7,8,11,14,19,21,1,2,3,4,6};
        int target=2;
        System.out.println(searchTarget(arr,target));
    }
    public static int searchTarget(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(arr[l]<=arr[mid]){
                if(target<arr[mid]&&target>=arr[l]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }


            }else{
                if(target<=arr[r]&& target>arr[mid]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;//not found
        // return l;//we can return left pointer in case of insertion position problem
    }
    
}
