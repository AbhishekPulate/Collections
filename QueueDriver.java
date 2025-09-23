package Collections;

public class QueueDriver extends ArrayQueue{
    public static void main(String[] args) {
        ArrayQueue al = new ArrayQueue(20);

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        al.add(80);

        System.out.println(al.peek());

        al.poll();
        al.poll();
        al.poll();
        al.remove();

        al.offer(200);
        System.out.println(al.element());
        System.out.println(al);
    }
}
