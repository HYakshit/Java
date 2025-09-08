package DSA;
import  java.util.PriorityQueue;
//The PriorityQueue is a class in Java that stores elements in a specific order based on priority, not the insertion order.
//
//🔍 Key Points:
//It is part of the java.util package.
//Elements are ordered using natural ordering (like numbers ascending) or a custom comparator.
//It is a min-heap by default → smallest element comes out first.
//It does not allow null elements.
//It is not thread-safe.
public class PriortyQ {
    PriorityQueue<Integer> q=new PriorityQueue<>();
    PriortyQ(int[] arr){
        for(int i : arr){
            q.offer(i);
        }
        System.out.println(q);

    }
}
class qmain{
    public static void main(String[] args) {

        PriortyQ obj=new PriortyQ(new int[]{1,2,3,4,5});
    }
}
