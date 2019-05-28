import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int i;
    int ar[]=new int[n];
    for(i=0;i<n;i++)
    {
      ar[i]=in.nextInt();
    }
    int max=ar[0],k=0;
    for(i=1;i<n;i++)
    {
      if(ar[i]>max)
      {
        max=ar[i];
        k=i;
      }
    }
    System.out.println(k);
  }
}