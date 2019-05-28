import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    StringBuilder sb=new StringBuilder("");
    int n1=n;
    int k=0,m=0;
    while(n1>0)
    {
      m=m*10+n1%10;
      n1=n1/10;
      k++;
    }
    sb.append(n);
    System.out.println(sb);
  }
}