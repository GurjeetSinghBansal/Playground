import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int i;
      for(i=a;i>=1;i--)
      {
        int k=b;
        int j=b;
        while(k>0)
        {
          if(j==i)
          {
            System.out.print(j);
          }
          else if(j>i)
          {
            System.out.print(j);
            j--;
          }
          k--;
        }
        System.out.println();
      }
    }
}