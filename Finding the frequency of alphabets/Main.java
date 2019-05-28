import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      String st=in.nextLine();
      StringBuilder str=new StringBuilder(st);
      int i,g;
      char ch;
      int l=str.length();
      int a[]=new int[26];
      for(i=0;i<26;i++)
      {
        a[i]=0;
      }
      for(i=0;i<l;i++)
      {
        ch=str.charAt(i);
        if(ch>='a'&&ch<='z')
        {
          g=(char)(ch-'a');
          a[g]++;
          if(a[g]>1)
          {
            str.setCharAt(i,'$');
          }
        }
        else if(ch>='A'&&ch<='Z')
        {
          g=(char)(ch-'A');
          a[g]++;
          if(a[g]>1)
          {
            str.setCharAt(i,'$');
          }
        }
      }
      for(i=0;i<l;i++)
      {
        ch=str.charAt(i);
        if(ch>='a'&&ch<='z')
        {
          System.out.print(ch);
          g=(char)(ch-'a');
          System.out.print(a[g]+" ");
        }
        else if(ch>='A'&&ch<='Z')
        {
          g=(char)(ch-'A');
          ch=(char)('a'+g);
          System.out.print(ch);
          System.out.print(a[g]+" ");
        }
      }
    }
}