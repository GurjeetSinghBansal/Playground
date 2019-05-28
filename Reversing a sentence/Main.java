import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      String str=in.nextLine();
      int l=str.length();
      StringBuilder sb=new StringBuilder(str);
      int p=0;
      reverse_string(sb, p, l); 
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      int i,j;
      char ch;
      StringBuilder s=new StringBuilder("");
      for(i=end_idx-1;i>=0;i--)
      {
        if(sb.charAt(i)==' ')
        {
          j=i+1;
          while(j<end_idx)
          {
            ch=sb.charAt(j);
            if(ch==' ')
            {
              break;
            }
            else
            {
              s.append(ch);
            } 
            j++;
          }
          ch=' ';
          s.append(ch);
        }
      }
      s.append(sb.charAt(0));
      System.out.println(s);
    }
}