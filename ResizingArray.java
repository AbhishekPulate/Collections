package Collections;

public interface ResizingArray {

    int initialCapacity = 10;
    double loadCap = 0.75;
    boolean add(Object o);
    boolean add(int index,Object o);
    boolean remove(Object o);
    boolean remove(int index);
    boolean clear();

}
