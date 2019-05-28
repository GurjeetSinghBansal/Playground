import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[]= new int[n];
      int i,j,temp;
      for(i=0;i<n;i++)
      {
        ar[i]=in.nextInt();
      }
      int k=in.nextInt();
      for(i=0;i<n-1;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(ar[i]>ar[j])
          {
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
          }
        }
      }
      n=n-k;
      System.out.println(ar[n]);
    }   
}