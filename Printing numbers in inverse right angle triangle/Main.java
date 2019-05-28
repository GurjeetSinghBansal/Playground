import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int i,j,num,s=n;
      for(i=n;i>=1;i--)
      {
        num=s;
        for(j=1;j<=i;j++)
        {
          System.out.print(num);
          num--;
        }
        System.out.println();
        s--;
      }
	}
}