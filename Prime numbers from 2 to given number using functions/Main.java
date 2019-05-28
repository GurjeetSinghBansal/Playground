import java.util.Scanner;
class Main{
  public static void prime(int num)
  {
    int i=2,k=0;
    while(i<=num)
    {
      k=1;
      if(i==2)
      {
        System.out.println(i);
      }
      else
      {
        k=0;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0)
        {
          k=1;
          break;
        }
      }
        if(k==0)
        {
          System.out.println(i);
        }
      }
      i++;
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
}