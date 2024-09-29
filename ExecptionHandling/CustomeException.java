package ExecptionHandling;

import java.util.Scanner;

 class MyExeption extends  Exception{
     MyExeption(String str){
         System.out.println(str);
     }
 }

public class CustomeException {
    public static void show() {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers:");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            // Throw custom exception for specific conditions
            if (b == 1 || b == 2) {
                throw new MyExeption("Invalid value for b: " + b);
            }
            System.out.println(a / b);
        } catch (MyExeption e) {
            // Print the exception message
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Close the scanner
            sc.close();
        }

    }

    public static void main(String[] args) {
        show();
    }
}
