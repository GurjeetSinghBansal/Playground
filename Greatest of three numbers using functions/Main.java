import java.util.Scanner;
class Main{
  public static int great(int h,int j)
  {
    int f;
    if(h>j)
    {
      f=h;
    }
    else
    {
      f=j;
    }
    return f;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int k=in.nextInt();
      int g=great(m,n);
      if(g>k)
      {
        System.out.println(g);
      }
      else
      {
        System.out.println(k);
      }
	}
}