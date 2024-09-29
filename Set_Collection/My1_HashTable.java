package Set_Collection;

import java.util.Hashtable;

public class My1_HashTable {
    public static void main(String[] args) {
        Hashtable hs= new Hashtable();
//        hs.put(102,"avinash");
//        hs.put(103,"aakkash");
//        hs.put(123,"Reman");

        hs.put(107,"john");
        hs.put(117,"rohn");
        System.out.println(hs);
        
        
        System.out.println(hs.get(107));
        System.out.println(hs.hashCode());

        for(Object key:hs.keySet()){
            System.out.println(key+": "+hs.get(key) +""+hs.hashCode());
        }
    }
}
