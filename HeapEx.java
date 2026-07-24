import java.util.PriorityQueue;
public class HeapEx{
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        minheap.add(50);
        minheap.add(20);
        minheap.add(40);
        minheap.add(10);
        System.out.println(minheap.peek());
        System.out.println(minheap);
    }
}