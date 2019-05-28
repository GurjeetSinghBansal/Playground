import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int k=0,m=n;
      while(n>0)
      {
        k++;
        n=n/10;
      }
      int i=1,sum=1,mo=0,add=0;
      n=m;
      while(n>0)
      {
      sum=1;
      mo=n%10;
      for(i=1;i<=k;i++)
      {
        sum=sum*mo;
      }
      add=add+sum;
        n=n/10;
      }
      if(m==add)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
    }
}