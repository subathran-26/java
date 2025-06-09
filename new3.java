1)VOWELS AND CONSONENTS
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String ch1=in.nextLine();
        int num=0;
        int count=0;
        int conso=0;
        int sym=0;
        for(int i=0;i<ch1.length();i++)
        {
            char ch=ch1.charAt(i);
             if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
             {
                  count++;
                  System.out.println(ch1.charAt(i));
             }
             else if(ch>='0' &&  ch<='9')
             {
                  num++;
             }
              else if(ch=='@' || ch=='#' || ch=='$'|| ch=='%'|| ch=='&'||ch=='*'){
                 sym++;
                 System.out.println(ch1.charAt(i));
             }
              else if(ch!='a'|| ch!='e'||ch!='i'||ch!='o'||ch!='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
             {
                  conso++;
                  System.out.println(ch1.charAt(i));
             }
        }
                  System.out.println("vowel count is:"+count);
                  System.out.println("--------------------------");
                  System.out.println("consonents count is:"+conso);
                    System.out.println("--------------------------");
                  int total=conso+count;
                   System.out.println("total words is:"+total);
                     System.out.println("--------------------------");
                   System.out.println("total numbers is:"+num);
                     System.out.println("--------------------------");
                   System.out.println("total symbol is:"+sym);
                     System.out.println("--------------------------");
    }
}
