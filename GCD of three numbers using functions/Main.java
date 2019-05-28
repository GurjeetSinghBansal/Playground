import java.util.Scanner;
public class Main{
  public static int gcd(int n1,int n2)
  {
    int s,an=0;
    for(s=2;s<=100;s++)
    {
      if(n1%s==0&&n2%s==0)
      {
        an=s;
      }
    }
    return an;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int k=in.nextInt();
      int b,c=0,i;
      if(n>0)
      {
      if(n<m&&n<k)
      {
        b=n;
        c=1;
      }
      else if(m<n&&m<k)
      {
        b=m;
        c=2;
      }
      else
      {
        b=k;
        c=3;
      }
    }
      int v,ans=0;
      if(c==1)
      {
        v=gcd(n,m);
        i=2;
        for(i=2;i<=v;i++)
        {
          if(v%i==0&&k%i==0)
          {
            ans=i;
          }
        }
      }
      else if(c==2)
      {
        v=gcd(m,n);
        i=2;
        for(i=2;i<=v;i++)
        {
          if(v%i==0&&k%i==0)
          {
            ans=i;
          }
        }
      }
      else if(c==3)
      {
       v=gcd(k,m);
        for(i=2;i<=v;i++)
        {
          if(v%i==0&&n%i==0)
          {
            ans=i;
          }
        }
      }
      System.out.println(ans);
	}
}