import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int a[][]=new int[n][m];
    int i,j;
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
      a[i][j]=in.nextInt();
      }
    }
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        System.out.print(a[j][i]+" ");
      }
      System.out.println();
    }
  }
}