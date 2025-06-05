class Main {
    public static void main(String[] args) {
        int age1=19;
        int age2=20;
        String g1="male";
        String g2="female";
        if(age1>=23 && g1=="male")
        {
        System.out.println("eligible for male");
        }
        else if(age2>=20 && g2=="female")
        {
        System.out.println("eligible for female");
        }
        else
        {
            System.out.println("not eligible for both");
        }
    }
}
--------------------------------------------------------------------------------------
    2)//bus ticket
class Main {
    public static void main(String[]args)
    {
        int age=20;
        String g="female";
        if(age<18 || g=="female")
        {
        System.out.println("ticket is free");
        }
        else
        {
            System.out.println("it is not free");
        }
    }
}
-------------------------------------------------------------------------------------------------
    3)//km sum
class Main {
    public static void main(String[]args)
    {
     int km=1;
     switch(km)
     {
         case 1:{
             System.out.println("rupee 100");
             break;
         }
         case 2:{
             System.out.println("rupee 200");
             break;
         }
          case 3:{
             System.out.println("rupee 300");
             break;
         } case 4:{
             System.out.println("rupee 400");
             break;
         } case 5:{
             System.out.println("rupee 500");
             break;
         } case 6:{
             System.out.println("rupee 600");
             break;
         } case 7:{
             System.out.println("rupee 700");
             break;
         } case 8:{
             System.out.println("rupee 800");
             break;
         }
         default:{
             System.out.println("not available");
             break;
         }
     }
    }
}
---------------------------------------------------------------------------------------------------------------------------------
4)//do while
class Main {
    public static void main(String[]args)
    {
        int i=5;
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<10);
    }
}
