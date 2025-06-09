1)
class Main{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
--------------------------------------------------------------------------------
    2)
import java.util.Scanner;
    class main
    {
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
             System.out.println("enter the size of the array");
             int n=in.nextInt();
             int[] arr=new int[n];
              System.out.println("enter the value");
             for(int i=0;i<n;i++)
        {
            arr[i] =in.nextInt();
             if(arr[i]%2==0)
            {
              System.out.println("the value is even="+arr[i]);
            }
            else
            {
                System.out.println("the value is odd="+arr[i]);
            }
           
        }
        System.out.println("numbers of values are:"+n);
     
}
}
3)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        int i = 0;
        int lastSpace = -1;
        
        // Find last space position
        try {
            while(true) {
                if(str.charAt(i) == ' ') {
                    lastSpace = i;
                }
                i++;
            }
        } catch(StringIndexOutOfBoundsException e) {}
        
        // Print last word first
        for(i = lastSpace + 1; ; i++) {
            try {
                result = result + str.charAt(i);
            } catch(StringIndexOutOfBoundsException e) {
                break;
            }
        }
        
        // Add space
        result = result + " ";
        
        // Print first word
        for(i = 0; i < lastSpace; i++) {
            result = result + str.charAt(i);
        }
        
        System.out.print(result);
    }
}
4)
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      String str="I Love Zoho";
      String str1[]=str.split(" ");
      System.out.println(str1[0]);
      for(int i=str1.length-1;i>=0;i--)
      {
          System.out.print(str1[i]+" ");
      }
    }
}
5)
public class ReverseStringNoSubstring {
    public static void main(String[] args) {
        String input = "subathran";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println(reversed);
    }
}
