package String;

import java.util.ArrayList;

public class Anagram {
    public static void main(String[] args) {
        String s="aacc";
        String t="ccac";
        System.out.println(isAnagram(s,t));
        
    }  public static boolean isAnagram(String s, String t) {
        char[] c=t.toCharArray();
        char[] c2=s.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        for(char item:c2){
            list.add(item);
        }
        if(c.length!=c2.length){
            return false;
        }
        for(char item:c){
                if(list.contains(Character.valueOf(item))){
                 list.remove(Character.valueOf(item));
                }else{
                    return false;
                }

            }
        return true;
    }
    
}
