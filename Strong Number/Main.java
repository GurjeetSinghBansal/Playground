import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int m=n;
      int i=0,mo=0,ans=1,sum=0;
      while(n>0)
      {
        mo=n%10;
        ans=1;
        for(i=1;i<=mo;i++)
        {
          ans=ans*i;
        }
        sum=sum+ans;
        n=n/10;
      }
      if(sum==m)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}