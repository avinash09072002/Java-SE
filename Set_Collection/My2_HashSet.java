package Set_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class hashset{
    HashSet hs=new HashSet();
    public void show(){

        hs.add(12);
        hs.add(12);  //doesnot contain null values

        hs.add("avinash");
        hs.add(null);
        hs.add(null);// doesnot contain null values;

        System.out.println(hs);         // print the values in set

                  Iterator itr =hs.iterator();
                  while(itr.hasNext()){
                      System.out.println(itr.next());
                  }
        System.out.println("========================================================================");


    }
}

class PassingCollection extends  hashset{        // passing one collection object to another Collection
        public void show1(){
            ArrayList<String> arl=new ArrayList<>();

              arl.add("avinashd....");
              arl.add("akash////");
              arl.add("mahesh/////");
            System.out.println(arl);
              hs.addAll(arl);

        }
}

public class My2_HashSet {
    public static void main(String[] args) {
          hashset obj=new hashset();
          obj.show();

          PassingCollection psc=new PassingCollection();
          psc.show1();
          psc.show();


          HashSet<Integer> set = new HashSet<>();
          set.add(32);
          set.add(53);
//         set.remove(32);
          Object arr[]=set.toArray();
              for(Object aray :arr){
                  System.out.println(aray);
              }

        System.out.println(Arrays.toString(arr));
              Iterator itr= set.iterator();
              while(itr.hasNext()){
                  System.out.println(itr.next());
              }
    }
}


//properites:
//        1.HashSet::=>
//        Key properties:
//        i.	HashSet is not index based data structure. It store the values based on the “HashCode” values.
//        ii.	Does not allow duplicate elements
//        iii.	Cannot store multiple null values
//        iv.	Can store the  different  data  types.
//        v.	HashSet does not contain “insertion order”
//        vi.	HashSet does not contain “sorting order”
//        vii.	Non synchronized data structure.
//        viii.	Data is actually stored in map( in terms of keys , and values) in backend.

