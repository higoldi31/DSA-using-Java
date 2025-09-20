package BinarySearch;

public class SearchTarget{
    public static void main(String[] args) {
        int[] arr={2,3,5,7,11,13,15,19,22,25};
        System.out.println(searchTarget(arr,11));
    }
    static int searchTarget(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                r=mid-1;
            }else{
                l=mid-1;
            }
        }
        return -1;
    }
}

