package List_Collection;

import java.util.*;

public class My_Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Blueberry");  // Adding at a specific index
        System.out.println("List after additions: " + list);


        // Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // Modifying elements
        list.set(2, "Citrus");
        System.out.println("List after modification: " + list);

        // Removing elements
        list.remove("Banana");
        list.remove(1);  // Remove element at index 1
        System.out.println("List after removals: " + list);

        // Checking size and containment
        System.out.println("Size of the list: " + list.size());
        System.out.println("List contains 'Apple': " + list.contains("Apple"));

        // Adding more elements
        list.addAll(Arrays.asList("Date", "Elderberry", "Fig"));
        System.out.println("List after adding more elements: " + list);

        // Removing all elements that are in a specified collection
        ArrayList<String> toRemove = new ArrayList<>(Arrays.asList("Date", "Elderberry"));
        list.removeAll(toRemove);
        System.out.println("List after removing specified elements: " + list);

        // Checking if the list contains all elements of another collection
        System.out.println("List contains all elements of toRemove: " + list.containsAll(toRemove));

        // Converting list to array
        Object[] array = list.toArray();
        System.out.println("List to array: " + Arrays.toString(array));

        // Creating a sublist
        List<String> sublist = list.subList(1, list.size());
        System.out.println("Sublist from index 1: " + sublist);

        // Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
