import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
        int n=in.nextInt();
      int i,j,k;
      for(i=0;i<n;i++)
      {
        for(k=n-1;k>i;k--)
        {
          System.out.print(" ");
        }
        for(j=0;j<=i*2;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
	}
}