import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int i=1;
      System.out.println(i);
      while(i<=n/2)
      {
        i++;
        if(n%i==0)
        {
          System.out.println(i);
        }
      }
      System.out.println(n);
	}
}