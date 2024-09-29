package Map_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class My_hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer>  map= new HashMap<>();
        //Insertion
        map.put("India",202);
        map.put("US",220);
        map.put("Russia",101);
        System.out.println(map);

        //searching
        if(map.containsKey("US")){
            System.out.println(map.get("US"));
        }
        System.out.println(map.get("India"));// if exists
        System.out.println(map.get("Pakistan"));      // not exist->print null

        System.out.println("======firstMethod============");

       for( Map.Entry<String,Integer> element: map.entrySet()){
           System.out.println(element.getKey());              // this getKey and getValue available in Map. Entry
           System.out.println(element.getValue());
       }
        System.out.println("======Secoond Method============");

        Set<String> keys=map.keySet();
       for(String key:keys){
           System.out.println(key +":"+map.get(key));
       }





    }
}
