package Collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ArrayQueue<E> implements Queue{

    Object[] al;
    int cap = Queue.initCap;
    int cnt = 0;

    ArrayQueue()
    {
        al = new Object[cap];
    }
    ArrayQueue(int initCap)
    {
        cap = initCap;
        al = new Object[cap];
    }

    @Override
    public boolean add(Object o) {
        E e = (E)o;
        if(cnt<(0.75*al.length))
        {
            al[cnt] = e;
            cnt++;
            return true;
        }
        else
        {
            Object[] temp = new Object[al.length*2];
            for(int i = 0;i<cnt;i++)
            {
                temp[i] = al[i];
            }
            al = temp;
            al[cnt] = e;
            cnt++;
        }
        return false;

    }

    @Override
    public E element() {
        return (E)al[0];
    }

    @Override
    public boolean offer(Object o) {
        if(add((E)o))
        {
            return true;
        }
        return false;
    }

    @Override
    public E peek() {
        return cnt>0?(E)al[0]:null;
    }

    @Override
    public E poll() {
        if(cnt>0)
        {
            E e = (E)al[0];
            for(int i = 1;i<cnt;i++)
            {
                al[i-1] = al[i];
            }
            cnt--;
            return e;
        }
        return null;
    }

    @Override
    public E remove() {

        return cnt>0?poll():null;
    }

    @Override
    public String toString() {
        String str = "[";
        for(int i = 0;i<cnt;i++)
        {
            str = str+al[i]+",";
        }

        return str+"]";
    }
}
