1)
import java.io.*;
class zero {
    public static void main(String[] args)
    {
        int arr[]=new int[2];
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Divided by zero operation cannot possible");
        }
         try {
            arr[5]=4;
         }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enter the valid indx");
        }
    }
}
