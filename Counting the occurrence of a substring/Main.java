import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    String str;
    Scanner in =new Scanner(System.in);
    str=in.nextLine();
    String str1=in.nextLine();
    int l=str.length();
    int l1=str1.length();
    int i,j,ans=0,k=0;
    for(i=0;i<l-l1+1;i++)
    {
      for(j=0;j<l1;j++)
      {
        k=0;
        if(str.charAt(i+j)!=str1.charAt(j))
        {
          k++;
          break;
        }
      }
      if(k==0)
      {
        ans++;
      }
    }
    System.out.println(ans);
  } 
}