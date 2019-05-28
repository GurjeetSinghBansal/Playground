import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int i,j,num=0;
      for(i=1;i<=n;i++)
      {
        num++;
        for(j=1;j<=n;j++)
        {
          if(i%2!=0)
          {
            if(j==n)
            {
              System.out.print(num+1);
            }
            else
            {
              System.out.print(num);
            }
          }
          else
          {
            if(j==1)
            {
              System.out.print(num+1);
            }
            else
            {
              System.out.print(num);
            }
          }
        }
        System.out.println();
      }
	}
}