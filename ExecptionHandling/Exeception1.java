package ExecptionHandling;

public class Exeception1 {
    public static void main(String[] args) {
        int a=0;
        int b=20;
        int [] arr={20,32,32};
        try {
            System.out.println(b / 12);
            System.out.println(arr[0]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("something wrong");
        }
        }
}
