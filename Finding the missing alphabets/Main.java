import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in =new Scanner(System.in);
      String str=in.nextLine();
      int i,o;
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
          o=(char)(ch-'a');
          a[o]++;
        }
        else if(ch>='A'&&ch<='Z')
        {
          o=(char)(ch-'A');
            a[o]++;
        }
      }
      for(i=0;i<26;i++)
      {
        if(a[i]==0)
        {
          ch=(char)('a'+i);
          System.out.print(ch+" ");
        }
      }
    }
}