import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int b[]=new int[n];
      int j=0;
      for(i=n-1;i>=0;i--)
      {
        b[j]=a[i];
        j++;
      }
      int k=0;
      for(i=0;i<n;i++)
      {
      if(a[i]!=b[i])
      {
      k=1;
        System.out.println("No");
        break;
      }
      }
      if(k==0)
      {
      System.out.println("Yes");
      }
    }
}