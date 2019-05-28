import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    String str1=in.nextLine();
    StringBuilder sb = new StringBuilder("");
    StringBuilder str=new StringBuilder(str1);
    str.append(' ');
    int l=str.length();
    int i,j,k=0;
    char ch;
    for(i=0;i<l;i++)
    {
      k=0;
      ch=str.charAt(i);
      if(ch==' '||i==l-1)
      {
        for(j=i-1;j>=0;j--)
        {
          ch=str.charAt(j);
          k=1;
           if(ch==' ')
          {
            break;
          }
          sb.append(ch);
        }
      }
      if(k==1)
      {
        sb.append(' ');
      }
    }
    System.out.println(sb);
  }
}