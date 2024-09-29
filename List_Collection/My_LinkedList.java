package List_Collection;

import java.util.LinkedList;

public class My_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(42);
        list.add(11);
        list.add(84);
        list.add(55);

//        LinkedList<Integer> list1=new LinkedList<>();
//        list1.add(42);
//        list1.add(55);
//        System.out.println(list.containsAll(list1));
        System.out.println(list);
        System.out.println(list.contains(42));

        System.out.println(list.pollFirst());
        System.out.println(list);
        System.out.println(list.pollLast());
        System.out.println(list);
        System.out.println(list.peekFirst());
        System.out.println(list);

    }
}
