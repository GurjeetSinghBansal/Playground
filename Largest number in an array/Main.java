import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int i;
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int m=a[0];
      for(i=1;i<n;i++)
      {
        if(a[i]>m)
        {
          m=a[i];
        }
      }
       System.out.println(m);
    }
}