package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {
    public static void main(String[] args) {
        //Queue is an Interface and LinkedList class implements it(note it!)
        Queue<Integer> queue=new LinkedList<>();

        queue.add(3);
        queue.add(11);
        queue.add(18);
        queue.add(32);
        queue.add(7);
        System.out.println(queue);
        System.out.println(queue.peek());//retrieves the first element
        System.out.println(queue.poll());//return and deletes the first element
        System.out.println(queue);
    }
   
}
