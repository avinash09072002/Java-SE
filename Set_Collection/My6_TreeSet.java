package Set_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class My6_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(30);
        ts.add(43);
        ts.add(39);
        Iterator itr= ts.iterator();
        System.out.println(ts.floor(35));
        System.out.println(ts.tailSet(39));

    }
}
