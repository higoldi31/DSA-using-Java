package BinarySearch;
//returning the square root of the given number rounded to integer 
//binary search algorithm is used
//time-complexity O(log n)
public class SquareRoot {
    public static void main(String[] args) {
        // int num=8;
        // int num=4;
        int num=10;
        System.out.println(sqrt(num));
    }
    public static int sqrt(int num){
        if(num==0||num==1){//handling edge cases
            return num;
        }
        int l=1;
        int r=num;
        int res=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid<num){//typecasted to long in case of large numbers
                res=mid;//could be the potential answer
                l=mid+1;
            }else if((long)mid*mid>num){
                r=mid-1;
            }else{
                return mid;
            }

            
        }
        return res;
    }
}
