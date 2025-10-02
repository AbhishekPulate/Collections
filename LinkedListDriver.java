package Collections;
import java.util.Arrays;
public class LinkedListDriver {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);

        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(110);
        l2.add(220);
        l2.add(310);
        l2.add(40);
        l2.add(50);
        l2.add(400);
        l2.add(70);

        //l1.clear();

        System.out.println(l1.equals(l2));

        Iterator<Integer> head = l1.iterate();
        while(head.hasNext())
        {
            System.out.println(head.next());
        }
        System.out.println("-------------------------------------------");
        Iterator<Integer> head1= l1.reverseIterate();
        while(head1.hasPrevious())
        {
            System.out.println(head1.previous());
        }
    }
}
