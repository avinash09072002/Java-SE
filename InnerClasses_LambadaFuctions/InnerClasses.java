package InnerClasses_LambadaFuctions;

 interface InnerClass{
public  void show();

}
public class InnerClasses  {
    public static void main(String[] args) {
        InnerClass obj= new InnerClass(){
            public void show(){
                System.out.println("override in inner class");
            }

        };
        obj.show();
    }
}
