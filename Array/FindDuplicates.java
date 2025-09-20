package Array;
//you are given a list of strings, and you need to find all duplicates in it
import java.util.HashSet;
import java.util.ArrayList;
public class FindDuplicates {
   
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(); 
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("orange");
        list.add("apple");
        list.add("banana");
        // System.out.println(list);
        System.out.println(findDuplicates(list));
    }
    public static ArrayList<String> findDuplicates(ArrayList<String> list){
        HashSet<String> seen=new HashSet<>();
        HashSet<String> duplicates=new HashSet<>();
        for(String items:list){
            if(!seen.add(items)){//.add() method returns true when item added and returns false when element already exists in seen list
                duplicates.add(items);//remember set only stores unique elements
            }
        }
        return new ArrayList<>(duplicates);
    }
    
}
