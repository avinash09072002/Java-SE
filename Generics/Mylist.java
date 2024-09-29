package Generics;

import java.util.ArrayList;
import java.util.List;

public class Mylist {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(32);
        list.add(43);
        list.add(32);
        list.add(55);
        System.out.println(list+ ""+list.size());
        list.add(0,100);
        System.out.println(list);
        list.set(0,121);
        System.out.println(list);
    }
}
