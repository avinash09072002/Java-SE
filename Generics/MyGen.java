package Generics;
 class CreatGeneric<T>{
     T container;
     public CreatGeneric(T container){
         this.container=container;
     }
     public  T getContainer(){
         return this.container;
     }
}
public class MyGen {
    public static void main(String[] args) {
        CreatGeneric<Integer> creatGeneric=new CreatGeneric<>(232);
        System.out.println(creatGeneric.getContainer());

        CreatGeneric<String> creatGeneric1= new CreatGeneric<>("this is container String");
        System.out.println(creatGeneric1.getContainer()+creatGeneric1.getClass().getName());
    }
}
