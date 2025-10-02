package Collections;

public class Node <E>
{
    E val;
    Node<E> prev;
    Node<E> next;
    static Node itr;
    private Node()
    {}
    public Node(E val,Node<E> prev,Node<E> next)
    {
        super();
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
    public String toString()
    {
        return ""+val;
    }
}
