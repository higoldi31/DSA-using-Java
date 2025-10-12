package Array;
//given an integer array ,find the number of even digit numbers 
public class EvenDigitNumbers {
    public static void main(String[] args) {
        int[] arr={12,234,56234,45,1234};
        System.out.println(calcNumberOfEvenDigitNumbers(arr));
        
    }
    public static int calcNumberOfEvenDigitNumbers(int[] arr){
        int count=0;
        for(int item:arr){
            int digits=countDigit(item);
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
    public static int countDigit(int n){//finding the length of the integer
        String numString=String.valueOf(n);
        int length=numString.length();
        return length;
    }
}
