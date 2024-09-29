package Set_Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class My3_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();

        linkedHashSet.add(43);
        linkedHashSet.add(43);
        linkedHashSet.add(53);
        linkedHashSet.add(200);
       linkedHashSet.add(200);
        System.out.println(linkedHashSet);

           Iterator itr =linkedHashSet.iterator();
           while(itr.hasNext()){
               System.out.println(itr.next()+"hash code is "+linkedHashSet.hashCode());
           }
    }
}
//follow the "insertion order" because of internal ds is hashTable and linked List