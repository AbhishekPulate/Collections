package Collections;

import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();

        l.add(50);
        l.add(70);
        l.add(90);
        l.add(130);
        l.add(110);
        l.add(120);
        l.add(130);

        System.out.println(l.contains(130));
    }
}
