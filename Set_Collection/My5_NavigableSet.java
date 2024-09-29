package Set_Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class My5_NavigableSet {
    public static void main(String[] args) {
        NavigableSet nvs= new TreeSet();
        nvs.add(10);
        nvs.add(20);
        nvs.add(30);
        nvs.add(40);
        nvs.add(50);
        System.out.println(nvs);
        System.out.println(nvs.descendingSet());
        System.out.println(nvs.lower(30));
        System.out.println(nvs.higher(40));

        System.out.println(nvs.floor(30));
        System.out.println(nvs.floor(25));

        System.out.println(nvs.ceiling(40));
        System.out.println(nvs.ceiling(46));

        System.out.println("-------------------------------------------");
        System.out.println(nvs.pollFirst());
        System.out.println(nvs);
        System.out.println(nvs.pollLast());
        System.out.println(nvs);
    }
}
