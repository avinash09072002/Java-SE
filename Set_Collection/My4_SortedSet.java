package Set_Collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class My4_SortedSet {
    public static void main(String[] args) {
        SortedSet st= new TreeSet();

        st.add(100);
        st.add(101);
        st.add(102);
        st.add(33);
        st.add(103);
        System.out.println(st);
        System.out.println(st.first());
        System.out.println(st.last());
        System.out.println(st.headSet(102));
        System.out.println(st.tailSet(101));
        System.out.println(st.subSet(101,103));

        Iterator itr= st.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
//        101
//        102
//        103
//        104
//        107
//        110
//        115
//
//        i.	first()-> 101
//        ii.	tail()-> 115
//        iii.	headset(104)  means less than 104 ->101,102,103
//        iv.	tailSet()->greater thean 104->107,110,115
//        v.	subset(107,115) means     104<=element>115 ->{104,110}
