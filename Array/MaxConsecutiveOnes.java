package Array;
//find the maximum number of consecutive ones
public class MaxConsecutiveOnes{
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
       int maxCount=0;
       int currCount=0;
       for(int item:nums){
        if(item==1){
            currCount++;
            maxCount=Math.max(maxCount, currCount);
        }else{
            currCount=0;
        }
       }
       return maxCount;
    }
}