import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder("");
    int n=in.nextInt();
    int l=str.length();
    int i,of;
    char ch;
    for(i=0;i<l;i++)
    {
      ch=str.charAt(i);
      if(ch>='a'&&ch<='z')
      {
        of=ch-n;
        if(of<97)
        {
          of=97-of;
          of--;
          ch=(char)('z'-of);
        }
        else
        {
        ch=(char)(of);
        }
        sb.append(ch);
      }
      else if(ch>='A'&&ch<='Z')
      {
        of=ch-n;
        if(of<65)
        {
          of=65-of;
          of--;
          ch=(char)('Z'-of);
        }
        else 
        {
        ch=(char)(of);
        }
        sb.append(ch);
      }
      else if(ch==' ')
      {
        sb.append(ch);
      }
    }
    System.out.println(sb);
  }
}