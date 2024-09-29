package Map_Collection;

import java.util.TreeMap;

public class My_MapTree {
    public static void main(String[] args) {
        TreeMap map= new TreeMap();
        map.put(1,21);
        map.put(6,43);
        map.put(2,32);
        map.put(3,74);
        map.put(5,32);
        System.out.println(map);
        System.out.println(map.firstEntry());
        System.out.println(map.floorEntry(4));
        System.out.println(map.headMap(3));
        System.out.println(map.subMap(2,5));
        System.out.println(map.tailMap(2));

    }
}
