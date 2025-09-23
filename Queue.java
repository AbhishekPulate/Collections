package Collections;

public interface Queue<E> {

    int initCap = 16;
    boolean add(E e);
    E element();
    boolean offer(E e);
    E peek();
    E poll();
    E remove();

}
