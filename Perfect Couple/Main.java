import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int ar[]=new int[n];
      int i,j;
      for(i=0;i<n;i++)
      {
        ar[i]=in.nextInt();
      }
      int val=in.nextInt();
      for(i=0;i<n-1;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(ar[i]+ar[j]==val)
          {
            System.out.println(ar[i]+", "+ar[j]);
          }
        }
      }
    }
}