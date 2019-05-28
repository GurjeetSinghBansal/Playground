import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k,num=1;
      for(i=0;i<n;i++)
      {
        for(k=n-1;k>i;k--)
        {
          System.out.print(" ");
        }
        for(j=0;j<=i;j++)
        {
          System.out.print(num+" ");
          num++;
        }
        System.out.println();
      }
    }    
}