package ExecptionHandling;

public class TryWithFinally {
    public static void main(String[] args) {

        try{
            int j=10/0;
        }catch (Exception e){
            e.getMessage();
        }finally {
            System.out.println("we must have to run");
        }
    }
}
