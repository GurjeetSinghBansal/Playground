import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch=in.next().charAt(0);
      int n=in.nextInt();
      int g=123;
      int t=ch;
      if(t>96&&t<123)
      {
        while(n>0)
        {
       if(t<=97)
       {
         ch=(char)(--g);
         t--;
       }
          else
          {
            ch=(char)(--t);
          }
          n--;
        }
      }
         else if(t>64&&t<=90)
         {
           while(n>0)
           {
             ch=(char)(--t);
             n--;
           }
         }
      System.out.println(ch);
    }
}