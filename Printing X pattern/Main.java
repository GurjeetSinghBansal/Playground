import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k,m=n/2;;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if(i==j||j==n)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        n--;
        System.out.println();
      }
      n=n+2;
      for(i=m;i>0;i--)
      {
        for(j=1;j<=n;j++)
        {
          if(j==i||j==n)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        n++;
        System.out.println();
      }
	}
}