import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int i,j,k,t;
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    if(n%2==0)
    {
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
    }
    else if(n%2!=0)
    {
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
    }
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}