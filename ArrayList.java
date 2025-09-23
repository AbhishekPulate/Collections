package Collections;

public class ArrayList {
    Object[] al ;
    int count = 0;
    int capacity = ResizingArray.initialCapacity;
    ArrayList()
    {
        al = new Object[capacity];
    }
    ArrayList(int cap)
    {
        al = new Object[cap];
    }

    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add("Hello");
        a1.add(true);
        a1.add('A');
        a1.add(3.14);
        a1.add('A');
        a1.add('A');
        a1.add('A');
        System.out.println(a1);

    }

    //@Override
    public boolean add(Object o) {
        if(count<al.length*ResizingArray.loadCap)
        {
            al[count++] = o;
            return true;
        }
        else
        {
            Object[] temp = new Object[al.length*2];
            for (int i = 0;i<count;i++)
            {
                temp[i]=al[i];
            }
            al = temp;
            al[count++] = o;
        }
        return false;
    }

    //@Override
//    public boolean add(int index, Object o) {
//        if(index<count)
//        {
//
//        }
//    }

    @Override
    public String toString() {
        String str = "[";
        for(int i = 0;i<al.length;i++)
        {
            str += al[i]+",";
        }
        str += al[count-1];
        return str+"]";
    }
}
