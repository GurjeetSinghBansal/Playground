import java.util.Scanner;
class Main{
  public static void po(int num1,int num2)
  {
    int sum=1;
    while(num2>0)
    {
      sum=sum*num1;
      num2--;
    }
    System.out.println(sum);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m=in.nextInt();
      po(n,m);
	}
}