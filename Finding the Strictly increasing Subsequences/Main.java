import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    int j,k,ans=0;
    for(i=0;i<n-1;i++)
    {
      k=0;
      for(j=i+1;j<n;j++)
      {
        if(a[i] < a[j] && k==0)
        {
          k=1;
          ans=a[j];
          System.out.println(a[i]+","+a[j]);
        }
        else if(ans<a[j] && a[i]<a[j] && k==1)
        {
          System.out.println(a[i]+","+a[j]);
        }
      }
    }
  }
}