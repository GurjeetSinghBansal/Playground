import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
       Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      System.out.println(fun(n));
    }
  public static int fun(int n)
  {
    if(n==1)
    {
      return 1;
    }
    return n+(fun(n-1));
  }
}