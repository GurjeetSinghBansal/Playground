import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int i,j=0;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int b[]=new int[10];
      for(i=0;i<n;i++)
      {
        b[i]=0;
      }
      j=0;
      for(i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          j++;
          continue;
        }
        b[j]=b[j]+1;
      }
      int max=b[0];
      for(i=0;i<10;i++)
      {
        if(b[j]>max)
        {
          max=b[j];
        }
      }
      System.out.println(max);
    }
}