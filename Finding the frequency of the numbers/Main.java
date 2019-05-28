import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int i,d;
      int q=in.nextInt();
      int ar[]=new int[n];
      for(i=0;i<n;i++)
      {
        ar[i]=in.nextInt();
      }
      int a[]=new int[q+1];
      for(i=0;i<q+1;i++)
      {
        a[i]=0;
      }
      for(i=0;i<n;i++)
      {
        d=ar[i];
        a[d]++;
      }
      for(i=1;i<q+1;i++)
      {
        System.out.println(i+" "+a[i]);
      }
    }
}