package ExecptionHandling;

class demo{
    public void show() throws ArithmeticException{
        int a=1;
        int b=0;
        System.out.println(a/b);
    }
}
public class ThrowsKeyword {



    public static void main(String[] args) {
        demo key= new demo();

       try{
           key.show();
       }catch (Exception e){
           System.out.println("Something went wrong");
       }
    }
}
