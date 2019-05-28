import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int i;
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
   int j,t,k;
   k=n/2;
    for(i=0;i<k-1;i++)
    {
      for(j=i+1;j<k;j++)
      {
        if(a[i]>a[j])
        {
          t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    for(i=k;i<n-1;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(a[i]<a[j])
        {
          t=a[j];
          a[j]=a[i];
          a[i]=t;
        }
      }
    }
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}