package String;
//check if a given string is palindrome(ignoring spaces,case, and punctuation)
public class CheckPalindrome{
    public static void main(String[] args) {
        String s=" A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(s));
        
    }
    public static boolean checkPalindrome(String s){
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");//regex is used
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;

            }else{
                l++;
                r--;
            }
        }
        return true;
    }
}