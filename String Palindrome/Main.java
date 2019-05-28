import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in =new Scanner(System.in);
      String str=in.nextLine();
       int k=0;
      StringBuilder sb=new StringBuilder("");
      int i;
      int n=str.length();
      for(i=n-1;i>=0;i--)
      {
        sb.append(str.charAt(i));
      }
      for(i=0;i<n;i++)
      {
        k=0;
        if(str.charAt(i)!=sb.charAt(i))
        {
          k=1;
          break;
        }
      }
      if(k!=0)
      {
        System.out.println("No");
      }
      else
      {
        System.out.println("Yes");
      }
    } 
}