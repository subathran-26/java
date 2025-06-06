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
