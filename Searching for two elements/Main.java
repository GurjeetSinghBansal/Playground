import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int i,k=0,l=0;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int b=in.nextInt();
      int c=in.nextInt();
      int d=0,e=0;
      for(i=0;i<n;i++)
      {
        if(b==a[i])
           {
             d++;
          k=i;
           }
           else if(c==a[i])
           {
             e++;
             l=i;
           }
      }
      if(d==0)
      {
        System.out.println("-1");
        if(e!=0)
        {
           System.out.println(l);
        }
        else
        {
           System.out.println("-1");
        }
      }
      else if(e==0)
      {
        if(d==0)
        {
           System.out.println("-1");
        }
        else
        {
           System.out.println(k);
        }
         System.out.println("-1");
      }
      else
      {
        System.out.println(k);
         System.out.println(l);
      }
    }
}