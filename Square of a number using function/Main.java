import java.util.Scanner;
class Main
{
  public static int sum(int s)
  {
    int k=s*s;
    return k;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a=sum(n);
      System.out.println(a);
	} 
}