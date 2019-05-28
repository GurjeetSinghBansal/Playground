import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    pre(arr, n);
  }
  public static void pre(int arr[], int n)
  {
    int i=0,k,j=0;
    int a[]=new int [4];
    a[0]=0;
    a[1]=0;
    a[2]=0;
    a[3]=0;
    while(i<n)
    {
      k=3;
      while(k>0)
      {
        a[j]=a[j]+arr[i];
        i++;
        k--;
      }
      j++;
    }
    int g=0;
    for(i=0;i<j-1;i++)
    {
      if(a[i]!=a[i+1])
         {
           g=1;
           System.out.println("Not a Perfect Batch");
           break;
         }
    }
    if(g==0)
    {
      System.out.println("Perfect Batch");
    }
  }
}