import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str=in.nextLine();
    String st1=in.nextLine();
    StringBuilder sb=new StringBuilder("");
    int l=str.length();
    int l1=st1.length();
    int i,j,k;
    for(i=0;i<l;i++)
    {
      k=0;
      for(j=0;j<l1;j++)
      {
      if(str.charAt(i)==st1.charAt(j))
      {
        k=1;
        break;
      }
      }
      if(k==0)
      {
        sb.append(str.charAt(i));
      }
    }
    System.out.println(sb);
  }
}