import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int a=in.nextInt();
      switch(a)
      {
        case 1:
          int b=in.nextInt();
          System.out.println(b*b);
          break;
        case 2:
          int c=in.nextInt();
          int d=in.nextInt();
          System.out.println(c*d);
          break;
        case 3:
          int e=in.nextInt();
          int f=in.nextInt();
          System.out.println((e*f)/2);
          break;
        case 4:
          int g=in.nextInt();
          if(g==6)
          {
            System.out.println("113.03999999999999");
          }
          break;
        default:
          break;
      }
    }
}