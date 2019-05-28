import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
   Scanner in = new Scanner(System.in);
    int n,m,i,j;
    n=in.nextInt();
    m=in.nextInt();
    int a[][]=new int[n][m];
    int b[][]=new int[n][m];
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        a[i][j]=in.nextInt();
      }
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        b[i][j]=in.nextInt();
      }
    }
    int k=0;
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        if(a[i][j]!=b[i][j])
        {
          k=1;
          break;
        }
      }
      if(k==1)
      {
        break;
      }
    }
    if(k==0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}