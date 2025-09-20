package BinarySearch;
public class MaxInRotatedSortedArray {
    //max in rotated sorted array is the pivot element
    //so the elememt present at the just right of the pivot element will be the min element
    public static void main(String[] args) {
        int[] arr={7,8,11,14,19,21,37,1,2,3,4,6};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr){
        int l=0;
  
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=arr[l]){//left sorted array
                if(arr[mid]<arr[mid+1]){
                    l=mid+1;
                }else{
                    return arr[mid];
                }
                }else{
                    if(arr[mid]<arr[mid+1]){
                        r=mid-1;
                    }
                }
                

            
        }
        return -1;
    }
    
}
