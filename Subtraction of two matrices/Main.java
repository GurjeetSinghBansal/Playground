import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int n,m;
    n=in.nextInt();
    m=in.nextInt();
    int a[][]=new int[n][m];
    int b[][]=new int[n][m];
    int c[][]=new int[n][m];
    int i,j;
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
     for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        c[i][j]=a[i][j]-b[i][j];
      }
    }
     for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        System.out.print(c[i][j]+" ");
      }
       System.out.println();
    }
  }
}