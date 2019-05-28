import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int i,coun=0;
      int ar[]=new int[n];
      for(i=0;i<n;i++)
      {
        ar[i]=sc.nextInt();
        if(ar[i]==0)
        {
          coun++;
        }
      }
      prep(ar, n, coun);
    }
  public static void prep(int ar[], int n, int coun)
  {
    int i;
    for(i=0;i<n;i++)
    {
      if(ar[i]==0)
      {
        continue;
      }
      else
      {
        System.out.print(ar[i]+" ");
      }
    }
    while(coun>0)
    {
      System.out.print("0 ");
      coun--;
    }
  }
}