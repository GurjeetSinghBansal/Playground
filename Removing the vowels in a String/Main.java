import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder("");
    char ch;
    int l=str.length();
    int i;
    for(i=0;i<l;i++)
    {
      ch=str.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
        continue;
      }
      else
      {
        sb.append(ch);
      }
    }
    System.out.println(sb);
  }
}