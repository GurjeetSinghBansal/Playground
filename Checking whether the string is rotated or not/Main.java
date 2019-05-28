import java.util.Scanner;
class Main{
 
 public static void main(String[] args) 
  { 
       Scanner in = new Scanner(System.in);
   int i,j;
   String str=in.nextLine();
   String str1=in.nextLine();
     int l1=str1.length();
   StringBuilder sb = new StringBuilder(str);
   int l=str.length();
   int h=0;
   for(i=0;i<l;i++)
   {
     sb.append(str.charAt(i));
   }
   int d=1;
   l=l+l-1;
   for(i=0;i<l-l1+1;i++)
   {h=0;
     for(j=0;j<l1;j++)
     {
       if(sb.charAt(i+j)!=str1.charAt(j))
       {
         h=1;
         d=0;
         break;
       }
     }
    if(h==0)
    {
      System.out.println("Yes");
      break;
    }
   }
   if(d==0&&h==1)
   {
     System.out.println("No");
   }
    }
}