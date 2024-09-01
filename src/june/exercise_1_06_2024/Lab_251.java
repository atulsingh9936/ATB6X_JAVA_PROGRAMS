package june.exercise_1_06_2024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab_251 {
    public static void main(String[] args) {

        Queue P1 = new PriorityQueue();
        //FIFO
        P1.add("B");
        P1.add("A");
        P1.add("C");
        P1.add("C");
        P1.offer("D");// offer is similar to add
     //   P1.add(null); // null is not supported in queue
        System.out.println(P1);
        System.out.println(P1.poll());
        System.out.println(P1.peek());
        System.out.println(P1);


        Iterator iterator = P1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }



    }
}
