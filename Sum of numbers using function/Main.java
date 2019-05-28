import java.util.Scanner;
class Main
{
  public static int fac(int num)
  {
   int s=0;
    while(num>0)
    {
      s=s+num;
      num--;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a=fac(n);
      System.out.println(a);
      
	}
}