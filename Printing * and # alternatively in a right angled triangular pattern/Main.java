import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		//Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int num=0,i,j;
      for(i=0;i<n;i++)
      {
        for(j=0;j<=i;j++)
        {
          if(num%2==0)
          {
            System.out.print("*");
            num++;
          }
          else
          {
            System.out.print("#");
            num++;
          }
        }
        System.out.println();
      }
    }
}