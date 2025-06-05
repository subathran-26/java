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
