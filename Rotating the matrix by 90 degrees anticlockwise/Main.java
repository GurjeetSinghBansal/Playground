import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n,m,i,j;
    n=in.nextInt();
    m=in.nextInt();
    int a[][]=new int[n][m];
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        a[i][j]=in.nextInt();
      }
    }
     for(i=m-1;i>=0;i--)
     {
       for(j=0;j<n;j++)
       {
         System.out.print(a[j][i]+" ");
       }
       System.out.println();
     }
  }
}