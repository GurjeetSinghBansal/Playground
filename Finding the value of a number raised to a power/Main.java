import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int w=1;
      while(b>0)
      {
        w=w*a;
        b--;
      }
      System.out.println(w);
    }
}