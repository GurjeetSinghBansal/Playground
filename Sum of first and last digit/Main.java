import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n =in.nextInt();
      int a=n%10;
      int b=0;
      while(n>0)
      {
        b=n%10;
        n=n/10;
      }
      System.out.println(a+b);
	}
}