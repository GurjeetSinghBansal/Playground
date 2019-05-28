import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int i=1,s=1;
      for(i=2;i<=n;i++)
      {
        s=s*i;
      }
      System.out.println(s);
	}
}